import java.net.*;
import java.io.*;
import java.util.*;

public class ex2b{

	public static void main(String[] args)throws Throwable{
		Scanner s = new Scanner(System.in);
		String dns,temp;
		Process p = Runtime.getRuntime().exec("nslookup localhost");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(p.getInputStream()));
		
		temp = buffer.readLine();		
		dns = temp.split("\\s+")[1];
		System.out.println("Dns is "+dns);

		p = Runtime.getRuntime().exec("nslookup "+dns);
		buffer = new BufferedReader(new InputStreamReader(p.getInputStream()));
		temp = buffer.readLine();
		while(!temp.contains("name")){
			temp = buffer.readLine();
		}
		if(temp.contains("name")){		
			dns = temp.split("\\s+")[3];
			System.out.println("ipaddress is "+dns);
		}

		
	}
}
