import java.io.*;
import java.net.*;
class clienta
{
public static void main(String[] args)throws Exception
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
Socket s=new Socket("localhost",1234);
PrintWriter p = new PrintWriter(s.getOutputStream(),true);
System.out.println("Enter the Data to send:");
String str=br.readLine();

p.print(str);

BufferedReader br1= new BufferedReader(new InputStreamReader(s.getInputStream()));
String str1=br1.readLine();
System.out.println("The received data :"+str1);
p.close();
s.close();




}
}