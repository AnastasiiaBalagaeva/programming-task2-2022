/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package programming.task2;



import org.junit.jupiter.api.Test;
import picocli.CommandLine;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */

public class AppTest {
    @Test
    public void bytesToHumanReadable() {
        assertEquals("1,35 MB", Base.calculateFileSize(1420356, 1024));
        assertEquals("9,95 KB", Base.calculateFileSize(10187, 1024));
        assertEquals("456,00 B", Base.calculateFileSize(456, 1024));
    }

    @Test
    public void sizeOfAllFiles() {
        File file = new File("src//test//resources");
        File[] files = file.listFiles();
        assertEquals("1,36 MB", Base.calculateFullSize(files));
    }


    @Test
    public void newBase() {
        assertEquals("1,42 MB", Base.calculateFileSize(1420356, 1000));
        assertEquals("10,19 KB", Base.calculateFileSize(10187, 1000));
        assertEquals("456,00 B", Base.calculateFileSize(456, 1000));
    }
}



