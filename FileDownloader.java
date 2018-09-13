// A Java program for a Client 
import java.net.*; 
import java.io.*; 


public class FileDownloader implements Runnable{
    Socket socket;
    String fileName;
    String storeLocation = "./server/";

    public FileDownloader(Socket socket, String fileName){
        this.socket = socket;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {   
            InputStream in = null;
            OutputStream out = null;
            try {
                    in = this.socket.getInputStream();
                    out = new FileOutputStream(storeLocation + fileName);
                    byte[] bytes = new byte[16*1024];

                    int count;
                    while ((count = in.read(bytes)) > 0) {
                        out.write(bytes, 0, count);
                    }

                    out.close();
                    in.close();
            }

            catch (FileNotFoundException ex) {
                 System.out.println("File not found. ");
            }
            this.socket.close();

        } 
        catch (IOException ex) {
            System.out.println("Can't get socket input stream. ");
        }


    }

}