import java.util.Scanner;
public class IT24102276Lab5Q3 {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int start, end;
int PerDay = 48000;

System.out.print("Enter Start Date: ");

start = input.nextInt();
System.out.print("Enter End Date: ");
end = input.nextInt();

if (start < 1 || start > 31 || end < 1 || end > 31) {
System.out.println("Days must be between 1 and 31");

}
else if (start >= end)
{
System.out.println("Start Date must be less than End Date");
}
else
{

int noOfDays = end - start;
System.out.println("Room Charge Per Day: Rs." + PerDay);
System.out.println("Number of Days Reserved: " + noOfDays);

double discount = 0;

if (noOfDays < 3) {
System.out.println("No Discount");
} 
else if (noOfDays == 3 || noOfDays == 4)
{
discount = 0.1;
} else if (noOfDays >= 5) 
{
discount = 0.2;
}
double totalAmount = PerDay * noOfDays * (1 - discount);
System.out.println("The amount to be paid: Rs." + totalAmount);
}
}
}