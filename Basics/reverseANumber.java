package Basics;

import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         
        while(n != 0){
            int lastDigit = n % 10;
            System.out.println(lastDigit);
            n = n / 10;
        }
    }
  
    
   
}
