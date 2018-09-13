// A Java program for a Server 
import java.net.*; 
import java.io.*; 


public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
                serverSocket = new ServerSocket(5050);
                Integer count = 0;
                while(true){
                    try {
                            count += 1;
                            System.out.println("Received a request, downloading file in background! ");
                            Socket socket = serverSocket.accept();
                            Runnable runnable = new FileDownloader(socket, count.toString());
                            Thread thread = new Thread(runnable);
                            thread.start();
                           
                    } catch (IOException ex) {
                        System.out.println("Can't accept client connection. ");
                    }
                }
        } 
        catch (IOException ex) {
            System.out.println("Can't setup server on this port number.");
        }
    }
}