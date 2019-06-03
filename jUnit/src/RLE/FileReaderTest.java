package RLE;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileReaderTest {

    private Main main = new Main();

    @Test
    public void testToHexString() {
        String testString = "AAAaaa1";

        String codingString = main.coder(testString).toString();
        String decodingString = main.decoder(codingString);

        assertEquals(testString, decodingString);
    }
}
