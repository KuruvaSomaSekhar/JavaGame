
import java.io.FileWriter;
import java.io.IOException;

public class GenerateCsv
{
   public static void main(String [] args)
   {
       generateCsvFile("c:\\test.csv"); 
   }
   
   private static void generateCsvFile(String sFileName)
   {
    try
    {
        FileWriter writer = new FileWriter(sFileName);
         
        writer.append("DisplayName");
        writer.append(',');
        writer.append("Age");
        writer.append('\n');

        writer.append("Somu");
        writer.append(',');
        writer.append("25");
            writer.append('\n');
            
        writer.append("Kuruva");
        writer.append(',');
        writer.append("20");
        writer.append('\n');
            
        //generate whatever data you want
            
        writer.flush();
        writer.close();
    }
    catch(IOException e)
    {
         e.printStackTrace();
    } 
    }
}
