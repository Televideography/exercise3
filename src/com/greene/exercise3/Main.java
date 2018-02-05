package com.greene.exercise3;
import java.util.Scanner;
public class Main {

    static double temperature = 0;

    static void userInput() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a temperature in Fahrenheit: ");
        temperature = reader.nextDouble();
    }

    static void toCelsius() {
        temperature = (temperature - 32) * 5 / 9;
    }

    static void toUser(){
        System.out.println("In Celsius that's " + temperature);
    }


    public static void main(String[] args) {
        int absoluteZero = -460;
        userInput();
        while(temperature > absoluteZero){
            toCelsius();
            toUser();
            userInput();
        }
    }
    }
