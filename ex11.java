/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program converts currency - euros to US dollars
import java.util.Scanner;
public class ex11{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    
       System.out.print("How many euros are you exchanging? ");
           int c_from = input.nextInt();         

       System.out.print("What is the exchange rate? ");
           double rate = input.nextDouble();

       System.out.println(c_from+" euros at an exchange rate of "+rate+" is");
       
       double c_to = c_from*rate;
       System.out.printf("%.2f U.S dollars.",c_to);
    }//end of main       
}//end of class