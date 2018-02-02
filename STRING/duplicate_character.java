//to print the duplicate characters in the string...


import java.util.Scanner;
class strdup
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n,count=0;
String s1;
System.out.println("ENTER THE INPUT STRING");
s1=in.nextLine();
n=s1.length();
System.out.println("THE LENGTH OF THE STRING IS " + n);
char c[]=s1.toCharArray();
if(s1.isEmpty())
{
	System.out.println("OOPS!!!");
	System.out.println("IT IS AN EMPTY STRING....");
    System.out.println("PLEASE ENTER THE STRING!!!");
}
else
{
for(i=0;i<n;i++)
{
	for(j=i+1;j<n;j++)
	{
		if(c[i]==c[j])
		{
			System.out.println(c[i]);
			count=1;
		}
	}
}
if(count==0)
		System.out.println("THERE IS NO DUPLICATE CHARACTER IN THE GIVEN STRING");
}
}}
