import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CreateFiles {

    public void WriteFile(int NUM) {
        try{
            // Create new file
            int this.Content = NUM;
            String path="D:\\a\\RanNUM.txt";
            File file = new File(path);

            // If file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            bw.write(content);

            // Close connection
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}