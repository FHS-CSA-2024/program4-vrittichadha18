//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class Program4 {
    public static void main(String[]args) {
        Scanner myScanner = new Scanner (System.in);
        
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int sum = 0;
        double average = 0;
        
        System.out.println("Enter first 3-digit number: ");
        number1 = myScanner.nextInt();
        
        System.out.println("Enter second 3-digit number: ");
        number2 = myScanner.nextInt();
        
        System.out.println("Enter third 3-digit number: ");
        number3 = myScanner.nextInt();
        
        System.out.println("Enter fourth 3-digit number: ");
        number4 = myScanner.nextInt();
        
        sum = (number1 + number2 + number3 + number4);
        average = (double)sum/4;
        
        System.out.println();
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println();
        System.out.println("The average of the four numbers is " + average);
    }
}


//Paste console output below:
/*
Enter first 3-digit number: 
475
Enter second 3-digit number: 
821
Enter third 3-digit number: 
369
Enter fourth 3-digit number: 
562

The sum of the four numbers is 2227

The average of the four numbers is 556.75


*/


