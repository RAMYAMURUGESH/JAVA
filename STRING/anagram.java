//anagram eg:earth==heart;it should ignore the cases

import java.util.Scanner;
class annagram
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String s1,s2;
int n1,n2,i,j,count=0;
System.out.println("ENTER THE INPUT STRING:");
s1=in.nextLine();
s2=in.nextLine();
n1=s1.length();
n2=s2.length();
String s11=s1.toLowerCase();
String s12=s2.toLowerCase();
//System.out.println(s11);
//System.out.println(s12);
char a1[]=s11.toCharArray();
char a2[]=s12.toCharArray();
if((s11.isEmpty())||(s11.isEmpty()))
	System.out.println("PLEASE ENTER THE INPUT STRINGS TO COMPARE!!!!");
else{
for(i=0;i<n1;i++)
{
	for(j=0;j<n2;j++)
	{
		if(a1[i]==a2[j])
			count++;
	}
}
if(count==n1)
{
System.out.println("THE GIVEN INPUT STRINGS ARE ANNAGRAMS");
}
else
System.out.println("THE GIVEN INPUT STRINGS ARE NOT ANNAGRAMS");
}
}}
