package com.avex.memory.conscious;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileNaming {
    public static String fileName(){
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
    String timeStampedFile = now.format(formatter);
    timeStampedFile = timeStampedFile + ".aex";
    return timeStampedFile;
    }
}
