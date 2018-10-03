import java.io.*;

public class IOTests {

    public static void main(String[] args) {
        String testFile = new String("2545.data");
        boolean readable;
        boolean writable;

        readable = isReadableFile(testFile);
        writable = isWriteableFile(testFile);

        if(writable) {
            System.out.println(testFile + " can be written to.");
            writeRecords(testFile);
        }
        if(readable) {
            System.out.println(testFile + " can be read from.");
            readRecords(testFile);
        }


    } // main

    private static void readRecords(String fileName) {
        try {
            DataInputStream inStream = new DataInputStream(new FileInputStream(fileName));
            System.out.println("Name\tAge\tPay");
            try {
                while (true) {
                    String name = inStream.readUTF();
                    int age = inStream.readInt();
                    double pay = inStream.readDouble();
                    System.out.println(name + "\t" + age + "\t" + pay);
                } // while
            } catch (EOFException e) {}
            finally {
                inStream.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("IOERROR: " + fileName + " NOT Found.");
        } catch (IOException e) {
            System.out.println("IOERROR: " + e.getMessage());
        }
    } // readRecords

    private static void writeRecords(String fileName){
        try {
            DataOutputStream outStream = new DataOutputStream(new FileOutputStream(fileName));

            // generate data, put it in the file
            for (int x=0; x<5; x++) {
                outStream.writeUTF("Name: " + x);
                outStream.writeInt((int) (20 + Math.random()*25));
                outStream.writeDouble(5.00 + Math.random()*500);
            }
            outStream.close();
        } catch (IOException e) {
            System.out.println("IOERROR: " + e.getMessage());
        }

    } // writeRecords

    private static boolean isReadableFile (String fileName) {
        try {
            File file = new File(fileName);
            if ( !file.exists() ) {
                throw (new FileNotFoundException("No such File: " + fileName));
            }
            if ( !file.canRead() ) {
                throw (new IOException("File not readable: " + fileName));
            }
            return true;
        } catch ( FileNotFoundException e ) {
            System.out.println("IOERROR: File NOT Found : " + fileName);
            return false;
        } catch ( IOException e ) {
            System.out.println("IOERROR: " + e.getMessage()) ;
            return false;
        }
    } // isReadableFile

    private static boolean isWriteableFile(String fileName) {
        try {
            File file = new File(fileName);
            if (fileName ==null){
                return false;
            }
            if (fileName.length() == 0) {
                throw (new IOException("invalid file name: " + fileName));
            }
            if (file.exists() && !file.canWrite()) {
                throw (new IOException("IOERROR: File not writeable: " + fileName));
            }
            return true;
        } catch (IOException e) {
            System.out.println("IOERROR: " + e.getMessage());
            return false;
        }
    } // isWriteableFile
} // IOTests

