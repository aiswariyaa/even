import java.util.Scanner;


import java.util.Scanner;
public class camelCase {
	public static void main(String args[])
	{
	String s1;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the string;");
	s1=in.nextLine();
	String[] s2=s1.split("\\s");
	for(int i=0;i<s2.length;i++)
	{
		char[] c=s2[i].toCharArray();
		String s3=Character.toString(c[0]);
		String org=s3.toUpperCase();
		for(int j=1;j<c.length;j++)
		{
			org=org+c[j];
			
		}
		System.out.print(org+" ");	
	}

}
}
