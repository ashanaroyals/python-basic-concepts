import java.util.Scanner;
class Decimalconversion
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int arr[]=new int[32];
int index=0;
while(num>0)
{
arr[index]=num%2;
num=num/2;
index++;
}
for(int i=index-1;i>=0;i--)
System.out.println(arr[i]);
}
}