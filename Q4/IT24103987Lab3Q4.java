import java.util.Scanner;

  public class IT24103987Lab3Q4 {

    public static void main(String[] args) {

      //Create a Scanner object to read the intput
      Scanner input=new Scanner(System.in);

      //Prompt the user to enter a five-digit of number
      System.out.print("Enter a five-digit of number:");
      int number=input.nextInt();

      //Ensure the number is exactly five digits
      if(number>=10000&&number<=99999) {

      //Extract the highest place value digit
      int digit1=number/10000;
      number=number%10000;

      //Extract the next place value digit
      int digit2=number/1000;
      number=number%1000;

      //Extract the next place value digit
      int digit3=number/100;
      number=number%100;

      //Extract the next place value digit
      int digit4=number/10;
      number=number%10;

      //Extract the fifth place value digit
      int digit5=number%10;
      number=number%10;


      //Display the output
      System.out.println(digit1+ " " + digit2+ " " +  digit3+ " " +  digit4+ " " +  digit5);

      }
     

      //Close the scanner
      input.close();

     }

}
     



