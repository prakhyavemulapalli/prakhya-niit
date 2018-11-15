import java.util.*;
class Palindrome{
public static void main(String []args)
{
int n,r=0,flag=0,temp,i,j=0;


Scanner s=new Scanner(System.in);
System.out.println("enter a number");
n=s.nextInt();
temp=n;
while(n!=0)
{
	r=n%10;
	n=n/10;
	j++;
}

int a[]=new int[j];
i=j-1;
//System.out.println("Before array "+i+" "+j);
n=temp;
while(n!=0)
{
	a[i]=n%10;
	//System.out.println("array element "+a[i]);
	n=n/10;
	i--;
}

for(i=0,j=j-1;i<=j;i++,j--)
{
	//System.out.println(i+" "+j);
	//System.out.println(a[i]+" "+a[j]);
	if(a[i]==a[j])
	flag=1;
	else
	flag=0;
	//System.out.println(flag);
	if(flag==0)
	break;
}

if(flag==1)
System.out.println("number is a palindrome");
else
System.out.println("not a palindrome");
}
}