import java.net.Socket;
import java.net.ServerSocket;
import java.net.BindException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;


public class Server {
    public Server() 
    throws BindException, IOException {
        serverSocket = new ServerSocket(33333);
    }

    public void dengar() throws IOException {
        System.out.println("Menunggu koneksi...");
        while (true) {

            try {
                Socket koneksi = serverSocket.accept();

                ProcessClientThread satuProcess = new ProcessClientThread(koneksi);
                Thread satuProcessThread = new Thread(satuProcess);
                satuProcessThread.start();       
            }
            catch(IOException err) {
                System.out.println(err);
            }
        }
    }

    private ServerSocket serverSocket = null;
}
