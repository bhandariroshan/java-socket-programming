// A Java program for a Client 
import java.net.*; 
import java.io.*; 

public class Client { 
    public static void main(String[] args) throws IOException {
        File folder = new File("./client/");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            Runnable runnable = new FileTransfer(file);
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}