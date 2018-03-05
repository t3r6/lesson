package lesson10;

public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Толкен");
        Book book2 = new Book("Война и мир");
        Magazine magazine1 = new Magazine("За рулем");
        Magazine magazine2 = new Magazine("Burda");
        Printable[] printable = {book1, book2, magazine1, magazine2};
        for (Printable p : printable) {
            p.print();
        }
        Magazine.printMagazines(printable);
        Book.printBooks(printable);
    }
}
