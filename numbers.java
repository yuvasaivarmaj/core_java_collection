/*Write a program that prints the numbers from 1 to 100. 
But for multiples of three, print "Fizz" instead of the number, 
and for the multiples of five, print "Buzz". 
For numbers that are multiples of both three and five, print "FizzBuzz". */

import java.util.Arrays;

public class numbers{
    static int[] i = new int[101];
    
    

    public static void main(String[] args) {
      for (int j=1;j<=100;j++){
        i[j]=j;
       if(i[j]%3==0 && i[j]%5==0){
        System.out.println("FizzBuzz");
       }else if(i[j]%5==0){
        System.out.println("Buzz");
       }else if(i[j]%3==0){
        System.out.println("Fizz");
       }
       else{
        System.out.println(j);
       }

      }

      //System.out.println(Arrays.toString(i));
    }
}

