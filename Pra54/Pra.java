import java.io.*;  
public class Pra {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("E:\\test.txt");    
           fw.write("Welcome to JAVA.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("File Written Successfully");    
     }    
}  