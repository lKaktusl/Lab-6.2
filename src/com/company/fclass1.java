package com.company;

public class fclass1 {
    protected int a = 12;
    private int b = 23;
    public int getB(){
        return this.b;
        }

    public static void main(String[] args) {
        new fclass2().method1();
    }
}

class fclass2 extends fclass1 {
   public void method1() {
        System.out.println("Значение protected a = " + a);
        System.out.println("Значение private b = " + getB());
    }
}

