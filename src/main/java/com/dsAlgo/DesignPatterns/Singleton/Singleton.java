package com.dsAlgo.DesignPatterns;

public class Singleton {
    private static Singleton obj;
// data member is static so that memory is allocated only once
    private Singleton(){
        System.out.println("Singleton is instantiated");
    }

    public static Singleton getInstance(){
       if(obj == null){
           obj = new Singleton();
       }
        return obj;
    }

    public static void doSomething(){
        System.out.println("Something is done");
    }

    public static void main(String[] args) {
        Singleton.getInstance().doSomething();
    }

}

