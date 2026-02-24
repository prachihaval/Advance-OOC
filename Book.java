package LibraryManagement;

class Book {
    String title, author, ISBN;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}

class Member {
    String name;
    int memberId;

    Member(String n, int id) {
        name = n;
        memberId = id;
    }

    void displayMember() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Book b = new Book("Java Programming", "James Gosling", "ISBN101");
        Member m = new Member("Prachi", 1);

        System.out.println("----- Book Details -----");
        b.displayBook();

        System.out.println("\n----- Member Details -----");
        m.displayMember();
    }
}