
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

import org.apache.commons.io.IOUtils;
/**
 * @author naveen.k
 */
public class XMLtoJSON {
    private URL url = null;
    private InputStream inputStream = null;   
    public void getXMLfromJson() {
        try{
            url = XMLtoJSON.class.getClassLoader().getResource("C:/Users/User/Desktop/sample.xml");
            inputStream = url.openStream();
            String xml = IOUtils.toString(inputStream);
           // JSON objJson = new XMLSerializer().read(xml);
            JSON objJson = new XMLSerializer().readArray(xml);

            System.out.println("JSON data : " + objJson);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
     try {
                if (inputStream != null) {
                    inputStream.close();
                }
                url = null;
            } catch (IOException ex) {}
        }
    }
    public static void main(String[] args) {
        new XMLtoJSON().getXMLfromJson();
    }
}
