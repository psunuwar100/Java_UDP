import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket=new DatagramSocket(12345);
        byte[] data=new byte[1024];
        DatagramPacket packet=new DatagramPacket(data,data.length);

        //receiving msg
        datagramSocket.receive(packet);
        String msg=new String(packet.getData(),0, packet.getLength());
        System.out.println(msg);
        datagramSocket.close();
    }
}
