package sample;
import java.io.*;  

public class Program4 {
	public static void main(String args[])throws Exception{    
	     FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Welcome shruthi...";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
		/* bout.flush(); */  
	     bout.close();    
	     fout.close();    
	     System.out.println("success");    
	}    
	}  



