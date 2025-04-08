import java.io.*;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class FilingSystem_Conscious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the emotion in the following memory : ");
        String emotion = sc.next();
        System.out.println("Enter the memory : ");
        sc.nextLine(); // to consume the extra new line from next()
        String memory = sc.nextLine();
        boolean success = FileCreation_Conscious(emotion, memory);
        if(success)
        {
            System.out.println("File created successfully");
        }
        else
        {
            System.err.println("An error occurred");
        }
    }
public static boolean FileCreation_Conscious(String emotion, String memory)
    {

        try {
            
        File folder = new File("Conscious" + File.separator + emotion);
        if (!folder.exists())
        {
            folder.mkdirs();
        }
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        String timeStampedFile = now.format(formatter);
        timeStampedFile = timeStampedFile + ".aex";
        File fileObj = new File(folder, timeStampedFile);
        boolean creationSuccess = fileObj.createNewFile();
        if(creationSuccess)
        {
            try(FileWriter writer = new FileWriter(fileObj)){
                writer.write("Emotion: " + emotion + "\n");
                writer.write("Timestamp: " + now.format(formatter) + "\n\n");
                writer.write(memory);
            }
        }
        else
        {
            return false;
        }
        return true;
    }
    catch(IOException e){
    System.err.println("An error occurred.");
    e.printStackTrace();
    return false;
    }
    }
}
