/*Write a program to check if a given string is a palindrome 
(reads the same forwards and backwards). */

import java.util.Scanner;

public class palindrome {
    
    String[] i;

public static void main(String[] args) {
  Scanner i =new Scanner(System.in);
  System.out.println("enter a string");
  String j = i.nextLine();

int p = j.length();
String formal= "";
  for(int l=p-1;l>=0;l--){
   
    char ch =j.charAt(l);
    formal +=ch;

  }

   if(formal.equals(j)){
    System.out.println("it is a palindrome");
   }else{
    System.out.println("not a palindrome");
   }

  }

}





