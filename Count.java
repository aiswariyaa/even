import java.util.Scanner;
public class Count {
public static void main(String[] args) {
 	Scanner in=new Scanner(System.in);
 	System.out.println("enter the range :");
 	int a=in.nextInt();
 	int b=in.nextInt();
 	int flag=0;
 	int count=0;
 	for(int i=a;i<=b;i++)
 	{
 		for(int j=2;j<i;j++)
 		if(i%j==0)
 		{
 			flag=0;
 			break;
 		}
 		else 
 			{
 			flag=1;
 			}
 		if(flag==1)
 		{
 			count++;

 	}
 	}
 	System.out.println("the count is :"+count);
	}

}
