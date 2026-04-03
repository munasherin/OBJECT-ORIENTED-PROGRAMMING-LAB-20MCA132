package muna;


import java.util.Scanner;

//Base class
class Publisher {
 String publisherName;

 void getPublisher(Scanner sc) {
     System.out.print("Enter Publisher Name: ");
     publisherName = sc.nextLine();
 }
}

//Book class inheriting Publisher
class Book extends Publisher {
 String title;
 double price;

 void getBook(Scanner sc) {
     System.out.print("Enter Book Title: ");
     title = sc.nextLine();

     System.out.print("Enter Book Price: ");
     price = sc.nextDouble();
     sc.nextLine(); // consume newline
 }
}

//Literature class inheriting Book
class Literature extends Book {

 void display() {
     System.out.println("\nCategory: Literature");
     System.out.println("Title: " + title);
     System.out.println("Price: " + price);
     System.out.println("Publisher: " + publisherName);
 }
}

//Fiction class inheriting Book
class Fiction extends Book {

 void display() {
     System.out.println("\nCategory: Fiction");
     System.out.println("Title: " + title);
     System.out.println("Price: " + price);
     System.out.println("Publisher: " + publisherName);
 }
}

public class BookDetails {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of books: ");
     int n = sc.nextInt();
     sc.nextLine();

     for (int i = 0; i < n; i++) {

         System.out.println("\n1. Literature");
         System.out.println("2. Fiction");
         System.out.print("Choose category: ");
         int choice = sc.nextInt();
         sc.nextLine();

         if (choice == 1) {

             Literature l = new Literature();
             l.getPublisher(sc);
             l.getBook(sc);
             l.display();

         } else if (choice == 2) {

             Fiction f = new Fiction();
             f.getPublisher(sc);
             f.getBook(sc);
             f.display();

         } else {
             System.out.println("Invalid choice");
         }
     }

     sc.close();
 }
}