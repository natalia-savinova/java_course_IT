package review3;

import java.util.Date;

public class Reader {

//    Библиотека. Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//    ФИО, номер читательского билета, факультет, дата рождения, телефон.
//    Методы takeBook(), returnBook().Разработать программу, в которой создается массив объектов данного класса.
//    Перегрузить методы takeBook(), returnBook(): takeBook, который будет принимать количество взятых книг.
//    Выводит на консоль сообщение "Петров В. В. взял 3 книги". takeBook,
//    который будет принимать переменное количество названий книг.
//    Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//    , который будет принимать переменное количество объектов класса
//    Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В.
//    взял книги: Приключения, Словарь, Энциклопедия". Аналогичным образом перегрузить метод returnBook(). В
//    ыводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
//    Или "Петров В. В. вернул 3 книги".

    private String fio;
    private int ticketNumber;
    private String faculty;
    private Date dateOfBirth;
    private String phoneNumber;

    public Reader(String fio) {
        this.fio = fio;
    }

    public void takeBook() {
        System.out.println(convertFio() + " взял книгу.");
    }

    public void takeBook(int numberOfBook) {
        System.out.printf("%s взял %s %s%n", convertFio(), numberOfBook, getBookForm(numberOfBook));
    }

    public void takeBook(String[] bookTitles) {
        System.out.println(convertFio() + " взял книги: " + unionBooks(bookTitles));
    }

    public void takeBook(Book[] books) {
        String[] bookTitles = new String[books.length];
        for(int i = 0; i < books.length; i++) {
            bookTitles[i] = books[i].title;
        }
        System.out.println(convertFio() + " взял книги: " + unionBooks(bookTitles));
    }

    public void returnBook() {
        System.out.println(convertFio() + " вернул книгу.");
    }

    public void returnBook(int numberOfBook) {
        System.out.printf("%s вернул %s %s%n", convertFio(), numberOfBook, getBookForm(numberOfBook));
    }

    public void returnBook(String[] bookTitles) {
        System.out.println(convertFio() + " вернул книги: " + unionBooks(bookTitles));
    }

    public void returnBook(Book[] books) {
        String[] bookTitles = new String[books.length];
        for(int i = 0; i < books.length; i++) {
            bookTitles[i] = books[i].title;
        }
        System.out.println(convertFio() + " вернул книги: " + unionBooks(bookTitles));
    }

    private String convertFio() {
        String[] partsOfName = fio.split(" ");
        return String.format("%s %s. %s.",
                partsOfName[0],
                Character.toUpperCase(partsOfName[1].toCharArray()[0]),
                Character.toUpperCase(partsOfName[2].toCharArray()[0]));
    }

    private String getBookForm(int number) {
        int last = number % 10;
        int prev = (number / 10) % 10;

        if(prev == 1) {
            return "книг";
        }

        switch (last) {
            case 1: return "книгу";
            case 2:
            case 3:
            case 4: return "книги";
            default: return "книг";
        }
    }

    private String unionBooks(String[] books) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < books.length; i++) {
            sb.append(books[i]);

            if(i != books.length - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
