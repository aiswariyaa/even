import java.util.Scanner;
public class OddAdd {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("enter the limit :");
	int n=in.nextInt();
	int odd=0;
	for(int i=0;i<=n;i++)
	{
	if(i%2!=0)
	{
odd=odd+i;
	}
	}
	System.out.println("the sum of odd numbers are :"+odd);
	}

}
