package extraHW2.task_14;

public class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title: " + bookTitle);

        Book newBook = new Book("Potter");
        String newBookTitle = newBook.getTitle();
        System.out.println("Book title: " + newBookTitle);
    }
}
