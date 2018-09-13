// A Java program for a Client 
import java.net.*; 
import java.io.*; 
import java.util.concurrent.*;


public class FileTransfer implements Runnable{
    File file;
    Socket socket = null;
    String host = "127.0.0.1";
    CountDownLatch latch;

    public FileTransfer(File file, CountDownLatch latch){
        this.file = file;
        this.latch = latch;
    }

    @Override
    public void run (){
        if (this.file.isFile()) {
            try{
                this.socket = new Socket(host, 5050);
                // System.out.println(this.file.getName());

                // Get the size of the file
                long length = this.file.length();
                byte[] bytes = new byte[16 * 1024];
                InputStream in = new FileInputStream(this.file);
                OutputStream out = this.socket.getOutputStream();

                int count;
                while ((count = in.read(bytes)) > 0) {
                    out.write(bytes, 0, count);
                }

                out.close();
                in.close();
                this.socket.close();
                this.latch.countDown();
            } 
            catch(IOException exception){
                System.out.println("Exception!!!");
            }
            
        }
    }
}