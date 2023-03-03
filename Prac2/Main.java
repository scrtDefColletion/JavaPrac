
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your telephone type (landline/mobile): ");
        String type = scanner.nextLine();
        String model, location, owner;
        int number;

        if(type.equals("mobile"))
        {
            System.out.printf("You have chosen a mobile phone, enter its model: ");
            model = scanner.nextLine();
            System.out.printf("number: ");
            number = Integer.parseInt(scanner.nextLine());
            System.out.printf("owner: ");
            owner = scanner.nextLine();

            MobilePhone mobilePhone = new MobilePhone(type, model, number, owner);
            mobilePhone.display();
        }
        else if(type.equals("landline"))
        {
            System.out.printf("You have chosen a landline phone, enter its model: ");
            model = scanner.nextLine();
            System.out.printf("number: ");
            number = Integer.parseInt(scanner.nextLine());
            System.out.printf("location: ");
            location = scanner.nextLine();

            LandlinePhone landlinePhone= new LandlinePhone(type, model, number, location);
            landlinePhone.display();
        }
        else{System.out.printf("Oops, something wrong :(");}

    }

}