
package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
/**
 *
 * @author Vudn
 */
public class NewClass {
     void showfile( String  namefile) {
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     
            String currentDirectory = System.getProperty("user.dir")+ "\\text\\"+ namefile;
            File f = new File(currentDirectory );
            System.out.println(currentDirectory);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF8"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                //String[] output = line.split(",");
                //System.out.println(output[0]); 
             }
            br.close();
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
    
     }
    
    
     void importfile( String importInput , String importOutput ) {
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     
            String inputDirectory = System.getProperty("user.dir")+ "\\text\\"+ importInput;
            String outputDirectory = System.getProperty("user.dir")+ "\\text\\"+ importOutput;
            File input = new File(inputDirectory );
            File output = new File(outputDirectory );
            FileWriter fw = new FileWriter(output, true);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input), "UTF8"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                fw.write("\n" + line);
                
                //String[] output = line.split(",");
                //System.out.println(output[0]); 
             }
            fw.close();
            br.close();
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
    
     }
       
}
