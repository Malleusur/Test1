package RLE;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;


public class FileReader {

    public String read() {
        String result = null;
        String fileName = "input.txt";

        try {
            File jarFile = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
            String inputFilePath = jarFile + File.separator + fileName;

            try (FileInputStream inStream = new FileInputStream(new File(inputFilePath))) {
                MappedByteBuffer bb = (inStream.getChannel()).map(FileChannel.MapMode.READ_ONLY, 0, inStream.getChannel().size());

                result = Charset.defaultCharset().decode(bb).toString();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return result;
    }
}
