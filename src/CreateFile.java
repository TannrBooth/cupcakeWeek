import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFile {
    public CreateFile(){
        try {
            File salesData = new File("salesData.txt");

            if(salesData.createNewFile()){
                System.out.println("File created: " + salesData.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch(IOException e){
            System.out.println("An error occurred");
        }
    };
}

