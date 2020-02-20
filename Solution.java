import java.util.Vector;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException; 
import java.io.*;

public class Solution{

    public class Library
    {
	public int B,D,S; //books, days for sign up, ship limit
	public Vector<Integer> books;
	public Vector<Integer> score;

	public Library(Scanner scanner, int d)
	{
	    B = scanner.nextInt();
	    D = scanner.nextInt();
	    S = scanner.nextInt();
	    books = new Vector<Integer>(B);
	    for (int i = 0; i < B; ++i)
		books.set(i, scanner.nextInt());
	    score = new Vector<Integer>(d);
	}

	public void calcScore(HashMap<Integer,Integer> bs)
	{
	    //TAKE INTO CONSIDERATION THE DAYS
	    //sort books based off of score value
	    return;
	}

	public Integer getBook(int i ) //returns the ith best book
	{
	    return books.get(i);
	}

	public Integer getScorewithDays(int d)
	{
	    return score.get(d);
	}

	public Integer getBooksWithDays(int d)
	{
	    if (d*S >= books.size())
		return books.size();
	    else
		return  d*S;
	}
    }

    public void calculateScore(Vector<Library> ls, HashMap<Integer,Integer> bs)
    {
	for (int i = 0; i < ls.size(); ++i)
	    (ls.get(i)).calcScore(bs);
    }

    public Vector<Integer> selectLibs(Vector<Library> ls)
    {
	return null;
    }

    public void solve()
    {
    }
    
    public static void main(String args[]) throws IOException
    {
	Solution solution = new Solution();
	//get file name
	System.out.print("file: ");
	Scanner scanner = new Scanner(System.in);
	String fName = scanner.next();
	File f = new File(fName + ".in");
	scanner = new Scanner(f);
	//input
	Integer B, L, D; //books, libraries, days
	B = scanner.nextInt();
	L = scanner.nextInt();
	D = scanner.nextInt();
	//hashmap used to store a record of bookId to score mapping, this allows for O(1) access
	HashMap<Integer,Integer> bs = new HashMap<Integer,Integer>(5*B); //reduces collision
	for (int i = 0; i < B; ++i)
	    bs.put(i, scanner.nextInt());
	Vector<Library> ls = new Vector<Library>(L);
	for (int i = 0; i < L;++i)
	    {
		Solution.Library x = solution.new Library(scanner, D);
		ls.set(i, x);
	    }
	//handle alg
	
	//start by constructing a list of Library score given x days
	//stored in l.d
	solution.calculateScore(ls,bs);

	//then select Libraries to maximize score
	Vector<Integer> selectedLibs = solution.selectLibs(ls);

	//output results
	PrintWriter writer = new PrintWriter(fName + ".out");
	writer.println(selectedLibs.size());
	for (int i = 0; i < selectedLibs.size(); ++i)
	    {
		D -= ls.get(selectedLibs.get(i)).D;
		writer.print(selectedLibs.get(i)); writer.print(" "); writer.println( (ls.get(selectedLibs.get(i))).getBooksWithDays(D));
		for (int j = 0; j < (ls.get(selectedLibs.get(i))).getBooksWithDays(D); ++j)
		    writer.println((ls.get(selectedLibs.get(i))).getBook(j) + " ");
		writer.println("");
	    }
	return;
    }
    
}
