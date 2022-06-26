package Phone_book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class exportContacts {
    /**
     * копирует файл
     * 
     * @param path
     * @return скопированный список
     * @throws FileNotFoundException
     */
    static ArrayList<String> exportContactsinRow(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        ArrayList<String> arr = new ArrayList<>(5);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\ ");
            if (words[0].isBlank() == false) {
                for (String a : words) {
                    arr.add(a);
                }
            }
        }

        scanner.close();
        return arr;
    }

    /**
     * показывает первый контакт под данным id
     * при остутствии пишет id и фразу"не найден"
     * 
     * @param id
     * @return Contact
     */
    static Contacts findContact(ArrayList<String> arr, int id) {
        Integer idtofind = id;
        String nametofind = "не найден";
        String surnametofind = "";
        String countrytofind = "";
        String numbertofind = "";
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() <= 2 && Integer.parseInt(arr.get(i)) == id) {
                idtofind = id;
                nametofind = arr.get(i + 1);
                surnametofind = arr.get(i + 2);
                numbertofind = arr.get(i + 3);
                countrytofind = arr.get(i + 4);
                break;
            }
        }
        return new Contacts(idtofind, nametofind, surnametofind, numbertofind, countrytofind);
    }

}
