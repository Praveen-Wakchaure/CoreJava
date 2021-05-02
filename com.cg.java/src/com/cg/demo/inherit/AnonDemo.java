package com.cg.demo.inherit;

interface Fun {

	 

    public abstract void funMethod();

 

}

 

class ClassOne implements Fun {

 

    @Override
    public void funMethod() {
        System.out.println("funMethod implemented in sub-class");
    }
}

 

public class AnonDemo {

 

    public static void main(String[] args) {
        Fun obj1 = new ClassOne();
        obj1.funMethod();
        
        Fun obj2 = new Fun() {
            @Override
            public void funMethod() {
                System.out.println("funMethod implemented in anonymous inner class");
            }
        };
        obj2.funMethod();
    }
}
 