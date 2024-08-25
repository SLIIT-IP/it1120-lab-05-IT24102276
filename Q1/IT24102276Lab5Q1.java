import java.util.Scanner;

public class IT24102276Lab5Q1{
public static void main(String[] args){


Scanner input = new Scanner(System.in);
int n1, n2, n3;

System.out.print("Enter the first integer:");
n1 = input.nextInt();

System.out.print("Enter the second integer:");
n2 = input.nextInt();

System.out.print("Enter the third integer:");
n3 = input.nextInt();


System.out.println("User entered numbers are: " + n1 + " " + n2 + " " + n3);

if(n2 > n1 && n3 > n1)
{
System.out.println("The smallest number is:"+n1);
}
else if(n1 > n2 && n3 > n2)
{
System.out.println("The smallest number is:"+n2);
}
else if (n1 > n3 && n2 > n3)
{
System.out.println("The smallest number is:"+n3);
}
else
{
System.out.println("");
}



if(n1 > n2 && n1 > n3)
{
System.out.println("The largest number is:"+n1);
}
else if(n2 > n1 && n2 > n3)
{
System.out.println("The largest number is:"+n2);
}
else if (n3 > n1 && n3 > n2)
{
System.out.println("The largest number is:" +n3);
}
else
{
System.out.println("");
}
}
}