package ankush.java1;
import java.io.*;
import java.util.*;
public class LRU{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
		int frames,pointer = 0,hit = 0,fault = 0,ref_len;
		Boolean isFull = false;
		int buffer[];
		ArrayList<Integer> stack = new ArrayList<Integer>();
		int reference[];
		int mem_layout [][];
		
		System.out.println("Please enter the number of frames: ");
		frames = Integer.parseInt(br.readLine ());
		System.out.println("please enter the length of the references string : ");
		ref_len = Integer.parseInt(br.readLine());
		
		reference = new int[ref_len];
		mem_layout = new int[ref_len][frames];
		buffer = new int [frames];
		for (int j = 0 ; j<frames ; j++)
			buffer[j] = -1;
		
		System.out.println("Please enter the reference string: ");
		for (int i = 0 ; i<ref_len ; i++)
		{
			reference[i]=Integer.parseInt(br.readline());
		}
			
		
	}
}