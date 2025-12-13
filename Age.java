import java.util.Scanner;
class  Age
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
if (age<18)
System.out.println("the person is minor");
else if(age>=18)
System.out.println("the person is a major");
else
System.out.println("the person is above the given age");
}
}               