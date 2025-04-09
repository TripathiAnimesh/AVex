package com.avex.memory.conscious;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MetaData
{
    public static boolean addMetaData(boolean fileCreationSuccess, File file ,String emotion) throws IOException {
        if (!fileCreationSuccess || file == null) {
            System.err.println("Invalid file input.");
            return false;
        }
        // return an error as the file hasn't been created.
    
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
    String timeStampedFile = now.format(formatter);
        try (FileWriter writer = new FileWriter(file , true)) {
            writer.write("Emotion: " + emotion + "\n");
            writer.write("Timestamp: " + now.format(formatter) + "\n\n");
            return true;
        }
        catch(IOException e)
        {
            System.err.println("Error writing to file: " + e.getMessage());
            return false;
        }
    }
    
}
