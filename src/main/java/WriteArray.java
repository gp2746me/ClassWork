import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.FormatFlagsConversionMismatchException;

/**
 * Created by gp2746me on 10/2/2018.
 */
public class WriteArray {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("WriteArray.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);
        String[]months = {"Jan","Feb","Mar"};
        for (int x = 0; x<months.length; x++){
            bufWriter.write(months[x]+"\n");
        }

        bufWriter.close();
    }
}
