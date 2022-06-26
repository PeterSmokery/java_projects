package Phone_book;

public class Contacts {
    private Integer id;
    private String name;
    private String surname;
    private String country;
    private String number;

    /**
     * шаблон для контакта
     */
    public Contacts(Integer id, String name, String surname, String country, String number) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.number = number;

    }

    /**
     * шаблон для контакта, где элементы в однной строке
     */
    public String getContactsinRow() {
        return String.format("%s %s %s %s %s\n%s\n", this.id, this.name, this.surname, this.number, this.country);
    }

    /**
     * шаблон для контракта,где каждый элемент в отдельной строке
     */
    public String getContactsinRows() {
        return String.format("%s\n%s\n%s\n%s\n%s\n%s\n", this.id, this.name, this.surname, this.number, this.country);
    }

}
