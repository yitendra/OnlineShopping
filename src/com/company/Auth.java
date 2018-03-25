package com.company;

import java.util.Scanner;

public class Auth {

    public  boolean Authenticate(){
       String username,password;
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Username: ");
       username= scan.next();
       System.out.print("Enter Password: ");
       password=scan.next();
       if(username.equals("Admin") && password.equals("Admin")){
           System.out.println("Logged In Successfully!");
           return true;
       }else {System.out.println("Wrong Credentials!"); return false;}
    }
}
