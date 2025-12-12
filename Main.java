import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Book book1 = new Book("Doraemon","FFF",30,0);
//        System.out.println(book1.title);
//        System.out.println(book1.author);
//        System.out.println(book1.price);
//        System.out.println();
//        Book unknownBook = new Book();
//        unknownBook.displayDetails();
//        System.out.println();
        Book hp1Book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 350.00,0);
        hp1Book.displayDetails();
        System.out.println();
        hp1Book.updatePrice(32000.00);
        hp1Book.displayDetails();
        System.out.println();
        Scanner disc = new Scanner(System.in);
        System.out.print("give me your discount: ");
        double dis = disc.nextDouble();
        hp1Book.getDiscount(dis);
        hp1Book.applyDiscount();
        hp1Book.displayDetails();

    }

}
