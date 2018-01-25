import java.net.*;
import java.io.*;
import java.util.*;

public class EchoClient{

	public static void main(String[] args)throws Throwable{
		Socket client = new Socket("localhost",2500);
		BufferedReader buffer = new BufferedReader(new InputStreamReader(client.getInputStream()));
		PrintStream ps = new PrintStream(client.getOutputStream());

		String input="",echo;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a message to send.Give 'bye' to exit");
		
		while(!input.equals("bye")){
			input = s.nextLine();
			ps.println(input);
			echo = buffer.readLine();
			System.out.println(echo);			
		}
		ps.close();
		buffer.close();
		client.close();
	}

}
