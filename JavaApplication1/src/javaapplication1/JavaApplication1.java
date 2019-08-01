//package file_handling;
package javaapplication1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.FileWriter;



/**
 *
 * @author Vudn
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass lop = new NewClass();
        lop.importfile("importkhoa2017.csv", "khoa2017.csv");
    }
}


