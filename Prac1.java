import java.util.Scanner;

/**
 * Prac1
 */
public class Prac1 
{

    public static void main(String[] args) 
    {
        System.out.println("Practical task 1. Variant 2. Student Kalakutin S.R. Group RIBO-04-21 \n");
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term of the deposit (in months):");
        int depTerm = sc.nextInt();
        System.out.println("Enter annual percentage:");
        double annPerc = sc.nextDouble();
        System.out.println("Enter deposit amount:");
        double deposit = sc.nextDouble();
        double initDep = deposit;
        sc.close();

        for (int i = 1; i <= depTerm; i++)
        {
            deposit += deposit*((annPerc/100.0)/12.0); 
        }



        double income = Math.round((deposit - initDep)*100.0) / 100.0;
        System.out.println("\nIncome for " + depTerm + " month: " + income + "\n");
        double avgIncome = Math.round((income / depTerm)*100.0 ) / 100.0;
        System.out.println("Avarage monthly income: " + avgIncome + "\n");

    }
}

