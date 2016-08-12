import java.io.*;
import java.net.*;

class TCPclient{


	public static void main(String argv[]) throws Exception {
		
		
		/*
		 Script of TCP client in java	
		
		*/

		String message;
		String messageModified;

		BufferedReader client = new BufferedReader( new InputStreamReader(System.in));
		Socket clientSocket = new Socket("localhost", 6789); // server and port of communication
		DataOutputStream sendserver = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader readserver = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		message = client.readLine();
		sendserver.writeBytes(message + '\n');
		messageModified = readserver.readLine();
		System.out.println("From server: " + messageModified);
		clientSocket.close();

	}
}