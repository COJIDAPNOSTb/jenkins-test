package org.example;

public class Calculator {


    public int add(int a, int b)
    {
        return a+b;
    }
    public double add (double a, double b)
    {
        return a+b;
    }
    public int minus(int a, int b)
    {
        return a-b;
    }
    public double minus(double a, double b)
    {
        return a-b;
    }
    public double divide(int a, int b)
    {
        if (b==0)
        {
            throw new IllegalArgumentException("Divide by zero");
        }
        return (double) a /b;
    }
}
