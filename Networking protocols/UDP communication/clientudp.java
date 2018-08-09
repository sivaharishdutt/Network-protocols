import java.io.*;
import java.net.*;
 
class clientudp
{
   public static void main(String args[]) throws Exception
   {
      BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
 
      DatagramSocket ds = new DatagramSocket();
 //Client Socket is created
 
      InetAddress IPAddress = InetAddress.getByName("localhost");
 //Gets the IP Address 

      byte[] sdata = new byte[1024];
      byte[] rdata = new byte[1024];
 
      String str = br.readLine();
 
      sdata = str.getBytes();
 //sends data
 
      DatagramPacket dp = new DatagramPacket(sdata, sdata.length, IPAddress, 9876);
      ds.send(dp);
 
      DatagramPacket dp1 = new DatagramPacket(rdata, rdata.length);
      ds.receive(dp1);
 
      String data= new String(dp1.getData());
      System.out.println("FROM SERVER:" + data);
      ds.close();
   
}
}
 
