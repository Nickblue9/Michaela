import java.util.Scanner;

public class GradeCalculator

{
public static void main(String[] args)
{
double TestScore;

Scanner keyboard = new Scanner (System.in);

System.out.print("Enter your test score "); 
TestScore = keyboard.nextDouble();  

if (TestScore < 60)
{
System.out.println("Grade is F");
} 
if (TestScore >= 60)
{
if (TestScore < 70)
{
System.out.println("Grade is D");
}
}

if (TestScore >= 70)
{
if (TestScore < 80)
{
System.out.println("Grade is C");
}
}
if (TestScore >= 80)
{
if (TestScore < 90)
{
System.out.println("Grade is B");
}
}
else
{
System.out.println("Grade is A");
}
}
}
