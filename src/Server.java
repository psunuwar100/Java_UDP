import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket=new DatagramSocket();
        String msg="prashansa dada";
        InetAddress address=InetAddress.getByName("localhost");
        DatagramPacket packet= new DatagramPacket(msg.getBytes(),msg.length(),address,12345);

        //sending msg
        datagramSocket.send(packet);


    }
}