package com.company;

public class Items {
    final String category[]={"Electronics","Lifestyle","TVs & Appliances","Books & More"};
    final String Electro[]={"Mobiles","Laptops","Smart Watches"};
    final String Life[]={"Men","Women","Kids"};
    final String TV[]={"TV","Audio & Video"};
    final String Books[]={"Books","Movies","Musical Instruments","Automotive"};
    final String Mobiles[]={"Redmi Note 5 Pro  ", "Samsung Galaxy S9+","Apple iPhone 10  ","Google Pixel 2     "};
    final float mobile[]={10000,50000,90000,54000};
    final String Laptops[]={"Dell Alienware R4","Asus Predator       ", "HP envy 5283      ", "Microsoft Surface 4"};
    final float laptop[]={300000,100000,90000,120000};
    final String Watches[]={"Fitbit 2   ","Motorola 360","Samsung Gear",};
    final float watch[]={4000,21000,13000};

    public void print(String s[],float p[]){
        for(int i=0; i<s.length; i++){
            System.out.println(i+1+". "+s[i]+"\t\tRs."+p[i]);
        }
    }

    public void Category(String cat[]){
        int count=1;
        for(String s:cat)System.out.println(count++ + ". "+s);
    }
}

