
import java.io.File;
public class DeleteFile {
    public static void main(String[] args){

        File fo = new File( "C:\\Users\\Shahid\\Desktop\\Example3.txt");
        if(fo.delete()){
            System.out.println("The file " + fo.getName() + "is deleted successfully ");
        }

        else{
            System.out.println("Some unexpected error occurred ");
        }

        }
        
    }
    

