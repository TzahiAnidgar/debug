package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class App 
{
    private static Logger logger = LogManager.getLogger(App.class.getName());
    public static void main(String[] args) {
        loggerPrint();
        long r, sum = 0, temp;
        long n = 12345678987654321L;

        Debugger.log("start here");

        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }
        Debugger.log("The next check is: stackTraces1()");
        stackTraces1();
        Debugger.log("Finish debugging program");
    }

    public static void stackTraces1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value in Celsius to convert in fahrenheit:");

        double Celsius = scanner.nextFloat();
        double fahrenheit = (Celsius * 1.8) + 32;

        System.out.printf("%.1f degrees Celsuis is %.1f degrees in Fahrenheit ", Celsius, fahrenheit);
        System.out.println("");
    }

    static void f1() {
        Thread.dumpStack();
    }
    static void f2() {
        f1();
    }
    static void f3() {
        f2();
    }
    static void f4() {
        f3();
    }

    public static void loggerPrint(){
        logger.fatal("this is a fatal print int Level:100");
        logger.error("this is a error print int Level:200");
        logger.warn("this is a warn print int Level:300");
        logger.info("this is a info print int Level:400");
        logger.debug("this is a debug print int Level:500");
        logger.trace("this is a trace print int Level:600");
    }

}
