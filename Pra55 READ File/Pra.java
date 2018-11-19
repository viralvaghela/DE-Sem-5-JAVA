import java.io.*;
  class Pra
{
      public static void main(String[] args) {

        try {

        String filename="temp.txt";
    
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
    
        String l  = null;
    
            while((l=br.readLine())!=null )
            {
                System.out.println(l);
    
            }
        }
        catch (Exception err) {
           System.out.println(err);
        }   
    }
          
}
   