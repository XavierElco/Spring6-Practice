package com.xav.SpringDiy;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Class.forName;

public class MyClassPathApplicationContext implements MyFactory{
    ArrayList<MyBean> myBeanList =  new ArrayList<>();
    Map<String, Object> map = new HashMap<>();

    public MyClassPathApplicationContext(String xmlPath) throws DocumentException {
        // parse xml
        parseXml(xmlPath);
        try {
            instanceBeans();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void instanceBeans() throws DocumentException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (myBeanList != null && myBeanList.size() > 0) {
            for (MyBean myBean: myBeanList) {
                // 通过Bean的到到class，利用反射创建对象
                 Object object = Class.forName(myBean.getClazz()).newInstance();
                 map.put(myBean.getId(), object);
            }
        }
    }

    private void parseXml(String xmlPath) throws DocumentException {
        // 获取解析器
        SAXReader reader = new SAXReader();
        URL url = this.getClass().getClassLoader().getResource(xmlPath);
        // 通过解析器解析
        Document document = reader.read(url);
        // 利用xmlPath获取beans标签下的bean
        XPath xPath = document.createXPath("beans/bean");
        System.out.println("我确实在运行");
        List<Element> list;
        list = xPath.selectNodes(document);
        // list不为空且长度大于0才进行遍历
        if (list != null && list.size() > 0) {
            for (Element e: list) {
                System.out.println(e + "-----------");
                String id = e.attributeValue("id");
                String clazz = e.attributeValue("class");

                // 的到了id和class，创建Bean的实例，将id和class封装到Bean中，将Bean添加到集合中
                MyBean myBean = new MyBean(id, clazz);
                myBeanList.add(myBean);

            }
        }


    }

    /**
     * 通过id获得对象
     */
    @Override
    public Object getBean(String id) {
        return map.get(id);
    }
}
