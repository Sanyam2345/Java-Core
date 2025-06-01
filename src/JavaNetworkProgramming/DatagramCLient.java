package JavaNetworkProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DatagramCLient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2001);
        // Sending Messgae process
        String msg = "Hello Server";
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"),2000);
        ds.send(dp);
        // Receiving message process
        byte[] buff = new byte[1024];
        dp = new DatagramPacket(buff, buff.length);
        ds.receive(dp);
        String response = new String(dp.getData(), 0, dp.getLength());
        System.out.println("From Server"+response);
        ds.close();
    }
}

class Server {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(2000);
        // Receiving message process
        byte[] buff = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buff, buff.length);
        ds.receive(dp);
        String msg = new String(dp.getData(), 0, dp.getLength()); // Storing received message in string
        System.out.println("From Client"+msg); // display msg

        // Sending msg from server to client
        String response = "Hello Client";
        dp = new DatagramPacket(response.getBytes(), response.length(),InetAddress.getByName("localhost"),2001);
        ds.send(dp);
        ds.close();
    }
}
