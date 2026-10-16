class Vehicle {
    void show() {
        System.out.println("Vehicle");
    }
}
class Car extends Vehicle {}

class Person {
    void show() {
        System.out.println("Person");
    }
}
class Employee extends Person {}
class Manager extends Employee {}

class Shape {
    void show() {
        System.out.println("Shape");
    }
}
class Circle extends Shape {}
class Rectangle extends Shape {}

class Main {
    public static void main(String[] args) {
        new Car().show();
        new Manager().show();
        new Circle().show();
        new Rectangle().show();
    }
}
