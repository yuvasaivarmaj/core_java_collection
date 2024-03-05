import java.util.Scanner;

public class factorial {
public static int factorial(int n){
    if (n==0){
        return 1;
        
    }else{
        return n*factorial(n-1);
    }
}
    public static void main(String[] args){

        Scanner b =new Scanner(System.in);
        System.out.print("enter your input : ");
        int n=b.nextInt();

        System.out.println(factorial(n));


    }

}


