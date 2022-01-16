package review3;

public class ReaderMain {

    public static void main(String[] args) {
        Reader firstReader = new Reader("Савинова Наталья Александровна");

        firstReader.takeBook();
        firstReader.returnBook();

        firstReader.takeBook(1);
        firstReader.takeBook(2);
        firstReader.takeBook(5);
        firstReader.takeBook(9);
        firstReader.takeBook(10);
        firstReader.takeBook(19);
        firstReader.takeBook(20);
        firstReader.takeBook(21);
        firstReader.takeBook(22);

        firstReader.returnBook(1);
        firstReader.returnBook(2);
        firstReader.returnBook(5);
        firstReader.returnBook(9);
        firstReader.returnBook(10);
        firstReader.returnBook(19);
        firstReader.returnBook(20);
        firstReader.returnBook(21);
        firstReader.returnBook(22);
        firstReader.returnBook(25);

        firstReader.takeBook(new String[] {"Словарь", "Энциклопедия"});
        firstReader.returnBook(new String[] {"Словарь", "Энциклопедия"});

        Book book1 = new Book("Приключения", "Аверин");
        Book book2 = new Book("Словерь", "Даль");

        firstReader.takeBook(new Book[] {book1, book2});
        firstReader.returnBook(new Book[] {book1, book2});

    }





}
