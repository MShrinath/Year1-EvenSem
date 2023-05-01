package classroom;

public class Library {
    static int BCount;
    //array of references to the class Book as instance variables
    private Book[] books;
    //constructor
    public Library() {
        this.books = new Book[10];
        BCount = 0;
    }
    public void addBook(Book book) {
        if (BCount < 10) {
            books[BCount] = book;
            BCount++;
        }
    }
    public void printAllBooks() {
        for (int i = 0; i < BCount; i++) {
            System.out.println(books[i]);
        }
    }
    public void SearchBookId(int id) {
        for (int i = 0; i < BCount; i++) {
            if (books[i].getBId() == id) {
                System.out.println(books[i]);
            }
        }
    }
    public void SearchBookName(String name) {
        for (int i = 0; i < BCount; i++) {
            if (books[i].getBName().equals(name)) {
                System.out.println(books[i]);
            }
        }
    }
    public void modifyAuthor(String name){
        for (int i = 0; i < BCount; i++) {
            if (books[i].getBName().equals(name)) {
                books[i].setBAuthor("Unknown");
            }
        }
    }

}
