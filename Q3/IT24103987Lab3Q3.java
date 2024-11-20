import java.util.Scanner;

  public class IT24103987Lab3Q2 {

    public static void main(String[] args) {

      //Create a Scanner object to read the intput
      Scanner input=new Scanner(System.in);

     //Prompt the user to enter the amount
     System.out.print("Enter the amount:");
     int amount=input.nextInt();

     //Calculate the number of 5000 notes
     int count5000=amount/5000;
     amount=amount%5000;

     //Calculate the number of 1000 notes
     int count1000=amount/1000;
     amount=amount%1000;

     //Calculate the number of 500 notes
     int count500=amount/500;
     amount=amount%500;

     //Calculate the number of 200 notes
     int count200=amount/200;
     amount=amount%200;

     //Calculate the number of 100 notes
     int count100=amount/100;
     amount=amount%100;

     //Calculate the number of 50 notes
     int count50=amount/50;
     amount=amount%50;

     //Calculate the number of 20 notes
     int count20=amount/20;
     amount=amount%20;

     //Calculate the number of 10 notes
     int count10=amount/10;
     amount=amount%10;

     //Calculate the number of 5 notes
     int count5=amount/5;
     amount=amount%5;

     //Calculate the number of 2 notes
     int count2=amount/2;
     amount=amount%2;

     //Calculate the number of 1 notes
     int count1=amount/1;
     amount=amount%1;

     //Display the output
     System.out.println();
     System.out.println("5000 notes:"+count5000);
     System.out.println("1000 notes:"+count1000);
     System.out.println("500 notes:"+count500);
     System.out.println("200 notes:"+count200);
     System.out.println("100 notes:"+count100);
     System.out.println("50 notes:"+count50);
     System.out.println("20 notes:"+count20);
     System.out.println("10 coins:"+count10);
     System.out.println("5 coins:"+count5);
     System.out.println("2 coins:"+count2);
     System.out.println("1 coins:"+count1);

     }

}







