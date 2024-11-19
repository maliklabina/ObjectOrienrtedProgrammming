import java.io.File;

public class FileInfo {
    public static void main(String[] args){
        //creating object of file which is previously created
        File fo = new File("C:\\\\Users\\\\Shahid\\\\Desktop\\\\Example2.txt");

        if(fo.exists()){
            //grtting file name
            System.out.println("Name of the file is " + fo.getName());

            //getting path of file
            System.out.println("Path of the file is "+ fo.getAbsolutePath());

            //checking if the file readable or not
            System.out.println("is file readable? ="+ fo.canRead());

            //checking if the file is writeable or not
            System.out.println("Is file writeable? = " + fo.canWrite());

            //getting length of file
            System.out.println("Length of the file is " + fo.length());
        }

        else{
            System.out.println("File does not exist ");
        }


        }

    }

