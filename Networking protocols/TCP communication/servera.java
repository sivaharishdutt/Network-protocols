import java.io.*;
import java.net.*;

class servera
{
public static void main(String[] args)throws Exception
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//String ip="localhost";
System.out.println("Server Started:");
ServerSocket ss=new ServerSocket(1234);

Socket s= ss.accept();
System.out.println("Server Started running:");
BufferedReader br1= new BufferedReader(new InputStreamReader(s.getInputStream()));
String str1=br1.readLine();
System.out.println("The received data :"+str1);
PrintWriter p = new PrintWriter(s.getOutputStream(),true);
System.out.println("Enter the Data to send:");

String str=br.readLine();
p.print(str);

}





}
}