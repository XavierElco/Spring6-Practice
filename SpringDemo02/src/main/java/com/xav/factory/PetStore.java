package com.xav.factory;

public class PetStore {
    public static Animals getPet(String petName){
        if ("dog".equals(petName)){
            return new Dog();
        } else if ("cat".equals(petName)){
            return new Cat();
        } else {
            return null;
        }
    }

    public Animals getPet2(String petName){
        if ("dog".equals(petName)){
            return new Dog();
        } else if ("cat".equals(petName)){
            return new Cat();
        } else {
            return null;
        }
    }
}
