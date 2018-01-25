import java.net.*;
import java.util.*;
import java.io.*;

public class NextHop{
	public static void main(String[] args)throws Throwable{
		String read, ipaddress, macaddress = null, temp;
		Process p = Runtime.getRuntime().exec("route");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(p.getInputStream()));
		buffer.readLine();
		buffer.readLine();
		read = buffer.readLine();
		ipaddress = read.split("\\s+")[1];
		
		p = Runtime.getRuntime().exec("arp -a");
		buffer = new BufferedReader(new InputStreamReader(p.getInputStream()));
		read = buffer.readLine();
		while(read!=null){
			temp = read.split("\\s+")[1];
			if(temp.equals("("+ipaddress+")")){
				macaddress = read.split("\\s+")[3];
				break;
			}
			read = buffer.readLine();
		}
		if(macaddress != null){
			System.out.println("next hop ip is "+ipaddress+" mac address is "+macaddress);

		}

	}
}
