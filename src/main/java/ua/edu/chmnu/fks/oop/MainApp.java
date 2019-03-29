package ua.edu.chmnu.fks.oop;

import java.util.Random;


public class  MainApp {
    public static void main(String[] args) {
        Random rand = new Random();
        double x = -1, a = 3.1 , b = 5.2, c = -11.4;
        // double y = Math.abs(Math.sqrt(a*x)*(Math.exp(3) - b)) / Math.log(2)*(Math.abs(Math.sqrt(x - c)))- Math.sin(Math.pow(x,2) - b / x) ;
       double y1 = (Math.abs(Math.pow(a * Math.pow(x, 3) -  b, 1/4)))/Math.log(Math.cbrt(x - c)) - Math.sin(x * x - b/x);
        double x1 = 1 +(100-1)* rand.nextDouble();
        System.out.println("Calculate result is = "+ y1);



    }
        }




