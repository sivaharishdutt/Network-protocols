import java.io.*;
import java.net.*;

class udpclient
{
public static void main(String[] args)throws Exception
{
DatagramSocket d=new DatagramSocket();
byte[] b=new byte[1024];
byte[] b1=new byte[1024];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter:");
String s=br.readLine();
b=s.getBytes();
InetAddress ia=InetAddress.getByName("localhost");
DatagramPacket dp=new DatagramPacket(b,b.length,ia,1234);
d.send(dp);

DatagramPacket ds=new DatagramPacket(b1,b1.length);
d.receive(ds);
String str=new String(ds.getData());
System.out.println("The data:"+str);
}
}