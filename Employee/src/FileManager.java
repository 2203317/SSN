import java.io.File;
import java.io.IOException;
public class FileManager implements GUI {
    public void fileManager(String filePath){
        try{
            File file = new File(filePath);
            if (file.createNewFile()){
                System.out.println("File has been created.");
            }else {
                System.out.println("The file has been found.");
                showDropDown();
            }
        }catch (IOException e){
            System.out.println("An error has occurred. Please try again.");
            fileManager(filePath);
        }
    }

    @Override
    public void showDropDown() {
    }
}
