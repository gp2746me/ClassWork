import java.io.BufferedWriter;

/**
 * Created by gp2746me on 10/2/2018.
 */

import java.io.BufferedWriter;
import java.io. FileWriter;
import java.io.IOException;
public class Writing {
    public static void main(String[] args)throws IOException{
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);

        bufWriter.write("hello\n");
        bufWriter.write("Data here\n");
        bufWriter.write("Goodbye\n");
        bufWriter.close();
    }

    }

