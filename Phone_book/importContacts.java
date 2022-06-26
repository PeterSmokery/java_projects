package Phone_book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class importContacts {
    /**
     * Записиывает новый контакт
     */
    static Contacts getScannerNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input id : ");
        String idString = in.next();
        Scanner scanner = new Scanner(idString);
        Integer id = 0;
        if (scanner.hasNextInt() == true) {
            id = Integer.parseInt(idString);
        } else {
            System.out.println("id не может быть словом");
            System.exit(1);
        }
        System.out.print("Input name : ");
        String name = in.next();
        System.out.print("Input surname: ");
        String surname = in.next();
        System.out.print("Input country: ");
        String country = in.next();
        System.out.print("Input number : ");
        String number = in.next();
        scanner.close();
        return new Contacts(id, name, surname, country, number);

    }

    /**
     * Записывает заданную строку в файл,где при отсутствии файла создаёт новый,
     * если пользователь соглашается
     * 
     * @throws IOException
     * 
     */
    static void writeResult(String str, String path) throws IOException {
        File file = new File(path);
        if (file.exists() && !file.isDirectory()) {

            FileWriter writer = new FileWriter(new File(path), true);
            {
                writer.write(str);
                writer.flush();
            }
        }
        if ((file.exists() == false) & (!file.isDirectory() == true)) {
            System.out.println("файла не существует,хотите записать новый файл?:да-1  , нет-0");
            System.out.println("ответ: ");
            Scanner in = new Scanner(System.in);
            String answer = in.next();
            Scanner scanner = new Scanner(answer);
            if (scanner.hasNextInt() == true) {
                int answerInt = Integer.parseInt(answer);

                if (answerInt == 1) {
                    FileWriter writer = new FileWriter(new File(path), false);
                    {
                        writer.write(str);
                        writer.flush();
                    }
                } else if (answerInt == 0) {
                    System.out.println("хорошо");
                } else {
                    System.out.println("вы ввели несуществующий вариант ответа");
                    System.out.println("");
                }
            } else {
                System.out.println("это не число");
                System.exit(1);
            }
            scanner.close();

        }
    }
}
