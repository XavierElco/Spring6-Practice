package com.xav.controller;

import com.xav.pojo.User;
import com.xav.service.UserService;
import com.xav.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class UserServlet extends HttpServlet {
    private UserService us;

    public void init() throws ServletException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        us = ac.getBean("userServiceImpl", UserServiceImpl.class);
    }

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException{
        // 处理乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        // 接收参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 调用业务层
        User user = us.selectOneUser(username, password);
        if (user != null) {
            // 跳转到首页：
            req.getRequestDispatcher("index.jsp").forward(req, resp);

        } else {
            resp.getWriter().write("登陆失败");
        }

    }
}
