import java.net.*;
import java.io.*;
import java.util.*;

public class EchoServer{
	public static void main(String[] args)throws Throwable{
		ServerSocket server = new ServerSocket(2500);
		Socket soc = server.accept();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		PrintStream ps = new PrintStream(soc.getOutputStream());
		String input="";		
		while(!input.equals("bye")){
			input = buffer.readLine();
			System.out.println("got : "+input);
			ps.println("got : "+input);			
	
		}		
		ps.close();
		buffer.close();		
		soc.close();
		server.close();
}
}
