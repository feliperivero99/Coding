

	
import java.io.*;
import java.net.*;
import java.util.*;

class TCPserver{
   
   
   
   public static void main(String argv[]) throws Exception{
	   
		/*
		 Script of TCP server in java	
		
		*/

         String stringClient;
         String stringCaps;
         ServerSocket servidorSocket = new ServerSocket(6789); // port of communication

         while(true){

			Socket clientSocket = servidorSocket.accept();
            BufferedReader clientInfo = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            DataOutputStream sendClient = new DataOutputStream(clientSocket.getOutputStream());
            stringClient = clientInfo.readLine();
            System.out.println("Received: " + stringClient);
            stringCaps = stringClient.toUpperCase() + '\n';
            sendClient.writeBytes(stringCaps);
         }
      }
}