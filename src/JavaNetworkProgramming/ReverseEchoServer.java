package JavaNetworkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket skt = new ServerSocket(1234);
        Socket client = skt.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintStream ps = new PrintStream(client.getOutputStream());
        String line;
        do {
            line = br.readLine();
            StringBuilder sb = new StringBuilder(line);
            sb.reverse();
            ps.println(sb.toString());
        } while (!line.equals("eyb"));
        client.close();
        skt.close();
    }
}

class Client {
    public static void main(String[] args) throws Exception {
        Socket ss = new Socket("localhost", 1234);
        BufferedReader kyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
        PrintStream ps = new PrintStream(ss.getOutputStream());
        String line;
        do {
            line = kyb.readLine();
            ps.println(line);
            System.out.println(br.readLine());
        } while (!line.equals("eyb"));
        ss.close();
    }
}