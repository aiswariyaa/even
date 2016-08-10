import java.util.Scanner;
public class SubstringAishu {
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the string :");
    String x=in.nextLine();
    System.out.println("enter the string2 :");
    String y=in.nextLine();
       	if(y.contains(x))
    	{
    		System.out.println("the string xis substring of y");
    	}
    	else
    	{
    		System.out.println("the string xis not a substring");
    	}
    }
	}


