package com.example.vehicles;

// Interface to achieve abstraction
 interface Vehicle {
    void start();
    void stop();
}


 class Car implements Vehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println(model + " is stopping.");
    }

    public String getModel() {
        return model;
    }
}

 class Bike implements Vehicle{
    private String model;

    public Bike(String model){
        this.model= model;
    }

    @Override
    public void  start(){
        System.out.println(model + " is starting.");

    }

    @Override
    public void stop(){
        System.out.println(model + " is stopping.");

    }
    public String getModel(){
        return this.model;
    }

}

 class Interface {
public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        car.start();
        car.stop();

        Vehicle bike = new Bike("Yamaha");
        bike.start();
        bike.stop();
    }
}