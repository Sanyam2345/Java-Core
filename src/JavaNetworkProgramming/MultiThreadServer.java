package JavaNetworkProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer implements Runnable{
    Socket client;
    public MultiThreadServer(Socket client) {
        this.client = client;
    }

    public static void main(String[] args) throws Exception{
        ServerSocket ss= new ServerSocket(1234);
        Socket client;
        int i = 0;
        do {
            client = ss.accept();
            i++;
            System.out.println("Client connected: "+i);
            MultiThreadServer mt = new MultiThreadServer(client);
            Thread t = new Thread(mt);
            t.start();
        }while (true);
    }
    public void run() {
        try {
            StringBuffer buff;
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintStream ps = new PrintStream(client.getOutputStream());
            String line;
            do {
                line = br.readLine();
                buff = new StringBuffer(line);
                ps.println(buff.reverse());
            } while (!line.equals("bye"));
        } catch (Exception _) {}
    }
}
