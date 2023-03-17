

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {



    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Practical task 4. Variant 2. Student Kalakutin S.R. Group RIBO-04-21 \n \n");
        System.out.printf(  "Список комманд: \n add - добавляет телефон в список | add серийный номер цвет модель тип(mobile/landline)\n" +
                "remove - удаляет телефон с указанным серийным номером | remove serial number \n" +
                "clear - очищает весь список телефонов\nclose - закончит работу программы\n \n");

        HashMap<String, Telephone> telephones = new HashMap<>();
        try{
            telephones.put("123x", new Telephone("123x","black","cisco","landline"));
            telephones.put("123y", new Telephone("123y","white","samsung","mobile"));
            telephones.put("123z", new Telephone("123z","green","nokia","mobile"));
        }catch (PhoneTypeException e){
            e.printStackTrace();
        }


        String input;
        String[] command;
        while(true)
        {

            display(telephones);
            System.out.printf("\n Введите команду:");
            input = scanner.nextLine();
            command = input.split("\\p{Space}");
            if (command[0].equals("close")){break;}
            else if (command[0].equals("clear")) {telephones.clear();}
            else if (command[0].equals("add"))
                {   try{
                    if(telephones.containsKey(command[1]) == true)
                    {
                        System.out.println("Телефон с серийным номером " + command[1] + " уже существует. \n"); continue;
                    }
                    telephones.put(command[1], new Telephone(command[1], command[2],command[3], command[4] ));}
                    catch (PhoneTypeException e) {System.out.println("Телефон может быть только mobile или landline\n");
                    }finally { continue; }
                }
            else if (command[0].equals("remove")) {telephones.remove(command[1]);}

        }
    }


    public static void display(HashMap<String, Telephone> telephones)
    {
        for(Map.Entry<String, Telephone> i : telephones.entrySet())
        {
            System.out.println("Текущий список телефонов:\n" + i.getValue());
        }
    }

}