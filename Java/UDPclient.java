import java.io.*;
import java.net.*;

class UDPclient{

      public static void main(String args[]) throws Exception{
    

      BufferedReader readKeyboard = new BufferedReader(new InputStreamReader(System.in));
      DatagramSocket clientSocket = new DatagramSocket();
      InetAddress IPAddress = InetAddress.getByName("localhost");
      
	  byte[] senddata = new byte[1024];
      byte[] receivedata = new byte[1024];
      
	  String cadena = readKeyboard.readLine();
      senddata = cadena.getBytes();
      DatagramPacket sendPacket = new DatagramPacket(senddata, senddata.length, IPAddress, 9876);
      clientSocket.send(sendPacket);
      DatagramPacket receivePacket = new DatagramPacket(receivedata, receivedata.length);
      clientSocket.receive(receivePacket);
      String cadenamodificada = new String(receivePacket.getData());
      System.out.println("SERVIDOR:" + cadenamodificada);
      clientSocket.close();
   }
}