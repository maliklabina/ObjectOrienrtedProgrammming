
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            File fo = new File("C:\\Users\\Shahid\\Desktop\\Example3.txt");
            Scanner DataReader = new Scanner(fo);

            while(DataReader.hasNextLine()){
                String fileData = DataReader.nextLine();
                System.out.println(fileData);
            }
            DataReader.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Error occurred ");
            exception.printStackTrace();
        }
        
    }
}
    

