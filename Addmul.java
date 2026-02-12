import java.util.Scanner;
class Addmul
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
char choice=sc.next().charAt(0);
if(choice=='M'||choice=='m')
{
System.out.println(a*b);
}
if(choice=='A'||choice=='a')
{
System.out.println(a+b);
}
}
}