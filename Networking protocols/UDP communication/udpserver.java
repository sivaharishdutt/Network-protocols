import java.io.*;
import java.net.*;

class udpserver
{
public static void main(String[] args)throws Exception
{
DatagramSocket d=new DatagramSocket(1234);
byte[] b=new byte[1024];
byte[] b1=new byte[1024];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
DatagramPacket dp=new DatagramPacket(b,b.length);
d.receive(dp);
String str=new String(dp.getData());
System.out.println("The data:"+str);

System.out.println("Enter:"); 
String s=br.readLine();
b1=s.getBytes();

InetAddress ia=dp.getAddress();
int port=dp.getPort();
DatagramPacket ds=new DatagramPacket(b1,b1.length,ia,port);
d.send(ds);
}
}