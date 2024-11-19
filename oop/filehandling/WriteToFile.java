//writing

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter fo = new FileWriter("C:\\Users\\Shahid\\Desktop\\Example3.txt");
            fo.write("writing into a file ");
            
            //closing the stream
            fo.close();
            System.out.println("content successfully wrote into the file ");
        } catch (IOException e) {
            System.out.println("Unexpected error occurred ");
            e.printStackTrace();

        }
    }
}
    
