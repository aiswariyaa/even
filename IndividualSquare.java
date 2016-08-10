import java.util.Scanner;
public class IndividualSquare {
public static void main(String[] args) {
 Scanner in=new Scanner(System.in);
 System.out.println("enter the integer :");
 int n=in.nextInt();
 int a;
 int sum=0;
 while(n!=0)
 {
	a=n%10;
	sum=sum+(a*a);
	n=n/10;
 }
System.out.println("the sum of individual squres are :"+sum);
	}

}
