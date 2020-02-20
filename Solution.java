import java.util.Vector;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException; 
import java.io.*;

public class Solution{

public static void main(String args[]) throws IOException
{
    //get file name
    System.out.print("file: ");
    Scanner scanner = new Scanner(System.in);
    String fName = scanner.next();
    File f = new File(fName + ".in");
    scanner = new Scanner(f);
    //handle alg

    //output results
    PrintWriter writer = new PrintWriter(fName + ".out");
    return ;
}
    
}
