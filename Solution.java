import java.util.Vector;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException; 
import java.io.*;

public class Solution{

public static void main()
{
    //get file name
    System.out.print("file: ");
    Scanner scanner = new Scanner(System.in);
    String fName = scanner.next();
    File f = new File(fName + ".in");
    try
	{
	    scanner = new Scanner(f);
	}
    catch (Exception e)
	{}
    //handle alg

    //output results
    try
	{
	    PrintWriter writer = new PrintWriter(fName + ".out");
	}
    catch (Exception e)
	{}
    return ;
}
    
}
