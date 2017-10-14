import java.net.*;
import java.io.*;
import java.util.*;
public class TimeClient{
public static void main(String[] args)throws Throwable{
DatagramSocket dSoc = new DatagramSocket(2000);
byte[] arr = new byte[100];
String time;
while(true){
DatagramPacket pac = new DatagramPacket(arr,arr.length);
dSoc.receive(pac);
byte[] receiveTime = pac.getData();
time = new String(receiveTime);
System.out.println(time);
}
}
}
