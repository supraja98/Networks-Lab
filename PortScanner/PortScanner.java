import java.net.*;
import java.io.*;
import java.util.*;

public class PortScanner{
	public static void main(String[] args)throws Throwable{
		int i=0,start,end;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the starting port : ");
		start = s.nextInt();
		System.out.println("enter the ending port : ");
		end = s.nextInt();
		for(i=start;i<end;i++){
			try{
				Socket soc = new Socket("localhost",i);
				System.out.println("Active port : "+i);
				soc.close();
			
			}catch(Exception e){}

		}

	}

}
