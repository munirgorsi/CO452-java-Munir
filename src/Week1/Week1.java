package Week1;
import helpers.*;

public class Week1 
{
    public static void main(String[] args)
    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        //String name = InputReader.getString("Enter your name > ");
        //System.out.println("Hello " + name);
        int num1 = InputReader.getInt ("enter num1 > ");
        int num2 = InputReader.getInt ("enter num2 > ");
        double average = (num1 + num2)/2;
        System.out.println("average is " + average);
        } 
}