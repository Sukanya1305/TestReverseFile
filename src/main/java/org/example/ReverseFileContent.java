package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



public class ReverseFileContent {

    String reverseFileContent(Path input) {
        try {
            String content = new StringBuilder(Files.readString(input)).reverse().toString();
           return Files.readString(Files.writeString
                    (Path.of("output.txt"), content));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
