import java.util.Scanner;

public class LeapYearOrNot_P7
{
    public static void main(String[] args)
    {
        System.out.println("Enter Your Choice Year :- ");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        if(((year % 4 == 0) && ( year % 100 != 0))||( year % 400 == 0))
        {
            System.out.println("Year is Leap Year :- ");
        }
        else
        {
            System.out.println("Year is Not Leap Year :- ");
        }
    }
}
