public class Book {
    String title;
    String author;
    double price;
    double discount;

//    public Book() {
//        this("Unknown","Unknown",1.0,0);
//    }

    public Book(String title, String author ,double price,double discount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.discount = discount;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public void updatePrice(double newPrice) {
        if(newPrice<0){
            System.out.println("Invalid price");
        }else{
            this.price = newPrice;

        }
    }
    public void getDiscount(double discount){
        this.discount = discount;

    }
    public void applyDiscount(){
        if(discount>0&&discount<100){
            System.out.println("\nDiscount attack!!!");
            double less;
            less = (price*discount)*0.01;
            this.price = price - less;
            System.out.println("Discount: " + discount);
        }else{
            System.out.println("\nSorry Invalid discount");
        }

    }

}