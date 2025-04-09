package com.avex.memory.conscious;

import java.io.*;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FilingSystemConscious {
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
            
        File folder = new File("output" + File.separator + emotion);
        if (!folder.exists())
        {
            folder.mkdirs();
        }
        String timeStampedFile = FileNaming.fileName();
        File fileObj = new File(folder, timeStampedFile);// file obj creation.
        boolean creationSuccess = fileObj.createNewFile();
        MetaData.addMetaData(creationSuccess, fileObj, emotion);
        return true;
    }
    catch(IOException e){
    System.err.println("An error occurred.");
    e.printStackTrace();
    return false;
    }
    }
}

