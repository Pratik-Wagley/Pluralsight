package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // question 1
        System.out.println();
        double bobSalary = 50_000;
        double garySalary = 70_000;
        double highestSalary;
        String message = "The highest salary is ";

        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println(message + highestSalary);

        // question 2
        double carPrice = 25_000;
        double truckPrice = 45_000;
        double smallest;
        String carMessage = "The smallest car price is ";

        smallest = Math.min(carPrice, truckPrice);

        System.out.println(carMessage + smallest);

        // question 3
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);



    }
}
