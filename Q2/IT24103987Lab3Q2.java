import java.util.Scanner;

  public class IT24103987Lab3Q2 {

    public static void main(String[] args) {

      //Create a Scanner object to read the intput
      Scanner input=new Scanner(System.in);

      //Prompt the user to enter the monthly salary
      System.out.print("Enter the monthly salary:");
      double monthlySalary=input.nextDouble();

      //Prompt the user to enter OT hours
      System.out.print("Enter the OT hours:");
      double otHours=input.nextDouble();

       //Prompt the user to enter OT rate
       System.out.print("Enter the OT rate:");
       double otRate=input.nextDouble();

       //Calculate the OT amount
       double otAmount=otHours*otRate;

       //Calculate the total salary
       double totalSalary=monthlySalary+otAmount;

       //Display the output
       System.out.println();
       System.out.println("Total salary including OT is:"+totalSalary);

       }

} 