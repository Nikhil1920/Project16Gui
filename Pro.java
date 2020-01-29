package project16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Pro
{
	public static String file_location,key_word;
	public static void setfile_location(String a)
	{
		file_location = a;
	}
	public static void setkey_word(String b)
	{
		key_word = b;
	}

	public static void main_func( ) throws IOException 
	   {
	      File f1=new File(file_location);
	      String[] words=null;
	      FileReader fr = new FileReader(f1);
	      BufferedReader br = new BufferedReader(fr);
	      String s;
	      int count=0;
	      while((s=br.readLine())!=null)
	      {
	         words=s.split(" ");
	          for (String word : words) 
	          {
	                 if (word.equals(key_word))
	                 {
	                   count++;
	                 }
	          }
	      }
	      if(count!=0)
	      {
	    	  Gui.set_res("The given word is present"+count+"Times in the file");
	      }
	      else
	      {
	         Gui.set_res("The given word is not present in the file");
	      }
	        fr.close();
	   }
}
