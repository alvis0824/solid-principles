package com.cydeo.solid.openClosed.example2.good;

public class Subtraction implements Operation{

    @Override
    public void calculation(int num1, int num2) {
        System.out.println(num1 - num2);
    }
}
