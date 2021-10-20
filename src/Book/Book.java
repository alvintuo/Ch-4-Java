package Book;


/*	Project 4.6
 *  Write a class called Book that contains instance data for the title, author, publisher, and
 *	copyright date. Define the Book constructor to accept and initialize this data. Include setter and
 *	getter methods for all instance data. Include a toString method that returns a nicely
 *	formatted, multi-line description of the book. Create a driver class called Bookshelf, whose
 *	main method instantiates and updates several Book objects.
 */

public class Book {

    private String title, author, publisher;
    private int date;


    public Book(String title, String author, String publisher, int date) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String toString() {
        String str = "Title: " + title + ", Author: " + author + ", Publisher: " + publisher + ", Copyright Date: " + date;
        return str;
    }

    public static void main(String[] args) {
        Book book = new Book("1984", "Orwell", "S & B", 1984);
        System.out.println(book);
    }

}