package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter:- ");
        if(user.hasNextInt())
        {
            System.out.println("This is an integer.");
        }
        else if(user.hasNextFloat())
        {
            System.out.println("This is an float");
        }
        else if(user.hasNextBoolean())
        {
            System.out.println("This is an Boolean");
        }
        else if((user.nextLine()).length() == 1)
        {
            System.out.println("This is an char");
        }
        else if(user.hasNextLine())
        {
            System.out.println("This is an String");
        }


    }

}
