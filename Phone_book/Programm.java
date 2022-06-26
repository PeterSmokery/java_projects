package Phone_book;

import java.io.IOException;
import java.util.ArrayList;

public class Programm {

    public static void main(String[] args) throws IOException {
        Contacts contactsInput = importContacts.getScannerNumber();
        importContacts.writeResult(contactsInput.getContactsinRows(),
                "C:/java.homework/Phone_Book/bookRows.txt");
        importContacts.writeResult(contactsInput.getContactsinRow(),
                "C:/java.homework/Phone_Book/bookRow.txt");

        // ArrayList<String> contactArray = new ArrayList<>();
        // contactArray =
        // exportContacts.exportContactsinRow("C:/java.homework/Phone_Book/bookRow.txt");

        // Contacts contactOutput = exportContacts.findContact(contactArray, 6);
        // System.out.println(contactOutput.getContactsinRow());
        // System.out.println(contactOutput.getContactsinRows());
    }

}
