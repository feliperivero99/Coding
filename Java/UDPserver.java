
import java.io.*;
import java.net.*;

class ServerUDP{


   public static void main(String args[]) throws Exception{

         DatagramSocket serverSocket = new DatagramSocket(9876);
		 
            byte[] Datareceive = new byte[1024];
            byte[] datasend = new byte[1024];
         
			while(true){
            
				  DatagramPacket receivePacket = new DatagramPacket(Datareceive, Datareceive.length);
                  
				  serverSocket.receive(receivePacket);
                  String message = new String( receivePacket.getData());
                  System.out.println("RECEIVED: " + message);
                  InetAddress IPAddress = receivePacket.getAddress();
                  int port = receivePacket.getPort();
                  String messageCaps = message.toUpperCase();
                  datasend = messageCaps.getBytes();
            
				  DatagramPacket sendPacket = new DatagramPacket(datasend, datasend.length, IPAddress, port);
                  serverSocket.send(sendPacket);
            }
      }
}