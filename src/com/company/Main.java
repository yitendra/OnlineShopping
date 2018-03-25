package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Auth auth = new Auth();
        if(auth.Authenticate()) {
            Main main = new Main();
            main.sell();
        }
    }

    private void cs(){
        System.out.println("Items Comming Soon!");
    }
    private void sell(){
        int ch;
        Items item=new Items();
        item.Category(item.category);
        System.out.print("Select a Catagory: ");
        Scanner scan =new Scanner(System.in);
        ch=scan.nextInt();
        switch (ch){
            case 1:electronic();break;
            case 2:cs();break;
            case 3:cs();break;
            case 4:cs();break;
            default:System.out.println("Choice Coming Soon!. Choose Other.");
        }
    }

    private void electronic(){
        int ch,c;
        Items item=new Items();
        item.Category(item.Electro);
        System.out.print("Select a Catagory: ");
        Scanner scan =new Scanner(System.in);
        ch=scan.nextInt();
        switch (ch){
            case 1:item.print(item.Mobiles,item.mobile);break;
            case 2:item.print(item.Laptops,item.laptop);break;
            case 3:item.print(item.Watches,item.watch);break;
            default:System.out.println("Choice Coming Soon!. Choose Other.");
        }
        System.out.print("Select A Product: ");
        c=scan.nextInt();
        --c;
        System.out.println("Product Selected:");
        switch (ch){
            case 1:System.out.println(item.Mobiles[c]+"\tRs."+item.mobile[c]);break;
            case 2:System.out.println(item.Laptops[c]+"\tRs."+item.laptop[c]);break;
            case 3:System.out.println(item.Watches[c]+"\tRs."+item.watch[c]);break;
            default:System.out.println("Choice Coming Soon!. Choose Other.");
        }

        System.out.print("Do you want to buy(y/n): ");
        String b;
        b=scan.next();
        if(b.equals("y"))System.out.println("Order Successful!");
        else System.out.println("Order Unsuccessful!");

    }
}
