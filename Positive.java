import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
             Scanner in=new Scanner(System.in);
             System.out.println("enter the number :");
             int a=in.nextInt(); 
		        if(a>0)
			{
				System.out.println(""+a+"is a positive integer");
			}
			else if(a<0)
			{
				System.out.println(""+a+" is a negative integer");
			}
			else if(a==0)
			{
				System.out.println(""+a+" is neither positive nor negative");
			
			}
		}
	}

