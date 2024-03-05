import java.util.Scanner;

public class prime {
   



     



public static void main(String[] args) {

   Scanner c =new Scanner(System.in);
   System.out.print("enter a value");
   int n = c.nextInt();
   //scanner.close();

    boolean isprime =true;
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
         isprime=false;
    }
    if(isprime){
        System.out.println("it is prime");

    }else{
        System.out.println("it is not prime");
    }
  
    

}
}
}



