
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.printf("Practical task 3. Variant 2. Student Kalakutin S.R. Group RIBO-04-21 \n");
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your telephone type (landline/mobile): ");
        String type = scanner.nextLine();
        String model, location, owner;
        int number; Telephone telephone;
        Seller seller = new Seller();

        if(type.equals("mobile"))
        {
            System.out.printf("You have chosen a mobile phone, enter its model: ");
            model = scanner.nextLine();
            System.out.printf("number: ");
            number = Integer.parseInt(scanner.nextLine());
            System.out.printf("owner: ");
            owner = scanner.nextLine();

            telephone = new MobilePhone(type, model, number, owner);
            telephone.display();
            seller.modify(telephone);
            System.out.printf("Modified: \n"); telephone.display();
        }
        else if(type.equals("landline"))
        {
            System.out.printf("You have chosen a landline phone, enter its model: ");
            model = scanner.nextLine();
            System.out.printf("number: ");
            number = Integer.parseInt(scanner.nextLine());
            System.out.printf("location: ");
            location = scanner.nextLine();

            telephone = new LandlinePhone(type, model, number, location);
            telephone.display();
            seller.modify(telephone);
            System.out.printf("Modified: \n"); telephone.display();
        }
        else{System.out.printf("Oops, something wrong :(");}

        scanner.close();

    }

}