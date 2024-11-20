import java.util.Scanner;

public class IT24103987Lab3Q1A {

  public static void main(String[] args) {

   //Create a Scanner object to read input
   Scanner input=new Scanner(System.in);

   //Prompt the user to enter the price per kilograms of rice
   System.out.print("Enter the price of 1kg of rice:");
   double pricePerKg=input.nextDouble();

   //Prompt the user to enter the number of kilograms they want to buy
   System.out.print("Enter the number of kilograms you want to buy:");
   double quantity=input.nextDouble();

   //Calculate the total amount to be paid
   double totalAmount=pricePerKg*quantity;

   //Display the output
   System.out.println();
   System.out.println("The total amount is:"+totalAmount);

   }

}
   