import java.net.*;
import java.io.*;
import java.util.*;
public class TimeServer{
public static void main(String[] args)throws Throwable{
DatagramSocket dSender = new DatagramSocket();
InetAddress address = InetAddress.getLocalHost();
System.out.println("Server Ready");
while(true){
Thread.sleep(1000);
Date date = new Date();
byte[] time = date.toString().getBytes();
DatagramPacket pac = new DatagramPacket(time,time.length,address,2000);
dSender.send(pac);
}
}
}
