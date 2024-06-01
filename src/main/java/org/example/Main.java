package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This is Member1");
        System.out.println("This is Member2");
        System.out.println("This is Member3");
        Fruit fruit = new Apple();
        fruit.name();;
        fruit = new Mango();
        fruit.name();
    }
}