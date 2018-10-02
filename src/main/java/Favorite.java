import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by gp2746me on 10/2/2018.
 */
public class Favorite {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("favorite.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);

        bufWriter.write("Nelah\n");
        bufWriter.write("Blue\n");
        bufWriter.write("2545\n");
        bufWriter.close();
    }

    }


