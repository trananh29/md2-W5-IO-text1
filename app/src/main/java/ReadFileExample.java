import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file= new File(filePath);
            if (!file.exists()) { 
                throw new FileNotFoundException();
            }
            BufferedReader reader= new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line= reader.readLine())!=null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            reader.close();
            System.out.println("The sum is: " + sum);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("File do not exist or content Error");
        }
    }

    public static void main(String[] args) {
        System.out.println("input the path of File: ");
        Scanner sc = new Scanner(System.in);
        String path= sc.nextLine();
        ReadFileExample readFileEx= new ReadFileExample();
        readFileEx.readFileText(path);
    }
    
}
