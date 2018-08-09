import java.io.*;
import java.net.*;
 
class serverudp
{
   public static void main(String args[]) throws Exception
      {
         DatagramSocket ss = new DatagramSocket(9876);
  //Server Socekt Created

      BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
 
            byte[] rdata = new byte[1024];
            byte[] sdata = new byte[1024];
            while(true)
               {
                  DatagramPacket ds = new DatagramPacket(rdata, rdata.length);
                  ss.receive(ds);
                  String str = new String( ds.getData());
                  System.out.println("RECEIVED: " + str);
 
                  InetAddress IPAddress =ds.getAddress();
                  int port = ds.getPort();
 
                  String str2 = str.toUpperCase();
   //Change sentence to Capital letter
                  sdata = str2.getBytes();
 
                  DatagramPacket ds1 =
                  new DatagramPacket(sdata, sdata.length, IPAddress, port);
                  ss.send(ds1);
   //Send Capitalized data back to client
               }
      }
}
