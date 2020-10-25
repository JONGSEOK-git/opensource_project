import java.util.Scanner;
import java.io.*;
public class text
{
     public static void main(String[] args) throws IOException
     {
       Scanner scan = new Scanner(System.in);
      File file=null;
      boolean inputFile=false;
       do
       {
         System.out.print("Enter a filename:");
         String fileName = scan.nextLine();
          inputFile= new File(fileName).isFile();
          if(inputFile){
              file=new File(fileName);
              inputFile=true;
          }

       }while(!inputFile);

       Scanner scanned = new Scanner(System.in); 
       System.out.println("Enter a word to search for: ");
       String searchW = scanned.next();
       int count = 0;

       Scanner in = new Scanner(file);
       String text=null;
       while(in.hasNextLine())
       { 
           text=in.nextLine();
         if(text.contains(searchW))
         { 
           count++;
           System.out.println(text); 
         }
       }
       System.out.println("The word" + " " + searchW + " " +  "was found" + " " + count + " " + "time(s) in this file");
       scan.close();
       in.close();
       scanned.close();
      }
     }