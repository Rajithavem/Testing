package org.example;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("learning");
        System.out.println(100+200);
        System.out.println("100+200="+(100+200));
        System.out.println(4490-621);
        System.out.println("4490-621="+(4490-621));
        System.out.println("current datetime: "+ LocalDateTime.now());
        int number1 = 100;
        int number2 = 200;
        int numberTotal = AddNumbers(number1, number2);
        int numberTotal1 = AddNumbers(33, 56);
        int numbersUBTRACT = SubtractNumbers(number1,number2);
        System.out.println("Subtract output: "+numbersUBTRACT);

        int abc = MultiplicationNumbers(100,200);
        System.out.println("Multication output: "+ abc);
        int xy =Division(4000,200);
        System.out.println("Division: "+xy);
        int total = 350;
        if(total==numberTotal)
        {
            System.out.println("equal");
        }
        else if (total>numberTotal)
        {
            System.out.println(">");
        }
        else if (total<numberTotal)
        {
            System.out.println(",");
        }
        else
        {
            System.out.println("none of the above");
        }
        boolean x = true;
        boolean y = false;
        if(x==y){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        System.out.println("Git testing");
        System.out.println("maven");
        System.out.println("Eclipse");
    }

    public static int AddNumbers(int a, int b){
        int total = a +b;
        return total;
    }
    public static int SubtractNumbers(int a, int b){
        int total = a-b;
        return total;
    }
    public static int MultiplicationNumbers(int f,int g){
        int multiplication = f*g;
        return multiplication;
    }
    public static int Division(int x,int y){
        int division = x/y;
        return division;
    }




}