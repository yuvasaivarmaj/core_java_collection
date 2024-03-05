import java.io.*;
import java.util.Scanner;

public class file {
    

    public static void main(String[] args)  {

      File file =new File("path");
        try{
      FileWriter writer = new FileWriter(file, true);
         Scanner obj = new Scanner(System.in);
         System.out.println("do you have an account");
         System.out.println("y or n");
         String c = obj.nextLine();
         if(c.equals("y")){

            Scanner obj1 =new Scanner(System.in);
            System.out.print("enter username");
            String y = obj1.nextLine();

            Scanner obj2 =new Scanner(System.in);
            System.out.print("enter password");
            String z = obj2.nextLine();
          boolean checkcredentialsd = checkcredentials(file,y,z);
          
          if(checkcredentialsd){
            System.out.println("you are login is successfull");
          }
          else{
            System.out.println("your credentials are not matching");
            System.out.println("Try signup by choosing n");
          }

         }else if (c.equals("n")){
            System.out.println("are you looking to create an account");
            Scanner obj3 =new Scanner(System.in);
            System.out.print("enter new username");
            String y = obj3.nextLine();
            writer.append("\n");
            writer.append(y).append(" ");
            Scanner obj4 =new Scanner(System.in);
            System.out.println("enter new password");
            String z = obj4.nextLine();
            writer.append(z).append("\n");
            System.out.println("your credentials are stored successfully");
         }
         writer.close();
         
      }catch(IOException e){
         System.out.println("error storing values");
      }

    }

   private static boolean checkcredentials(File file, String username, String password) throws IOException{
               Scanner scanner =new Scanner(file);
               while (scanner.hasNextLine()) {
                  String line = scanner.nextLine();
                  String[] parts = line.split("\\s+"); // Split line by whitespace
        if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
            scanner.close();
                       return true;
                  }
               }
               Scanner close;
               return false;

            
         }

      }   

         
 


        
    

