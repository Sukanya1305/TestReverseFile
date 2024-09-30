package org.example;




import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class ReverseFileContentTest {
@InjectMocks
private ReverseFileContent reverseFileContent;
@BeforeEach
void setUp(){
    MockitoAnnotations.initMocks(this);
}

    @Test
    void givenInputFile_reversesFileContentIInvoked_VerifyOutputFile() throws IOException {
        var inputContentFile= Path.of("src/main/java/org/example/input.txt");
      var outputFileContent= reverseFileContent.reverseFileContent(inputContentFile);
      assertEquals(outputFileContent, new StringBuilder(Files.readString(inputContentFile)).reverse().toString());
    }
}