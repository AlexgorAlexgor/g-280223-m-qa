package lesson4.task6;

public class Book implements Cloneable {

    private String name;
    private Author author;

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public Book(Book book) {
        this.name = book.getName();
        Author author1 = new Author(book.getAuthor().getName());
        this.author = author1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
//    public Book(String name, String author) {
//        this.name = name;
//        this.author = author;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}