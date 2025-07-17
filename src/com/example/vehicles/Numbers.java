package com.example.vehicles;

// Use of Object and Classes in Java

class Numbers{
    private int a;
    private int b;

    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }

    public void sum(){
        System.out.println(a+b);
    }
    public void subtract(){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.setA(5);
        obj.setB(3);

        obj.sum();
        obj.subtract();
    }
}