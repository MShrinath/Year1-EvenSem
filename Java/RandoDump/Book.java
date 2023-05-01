package classroom;

public class Book {
    int BId,yop;
    String BName,BAuthor;
    Book(int id, String name, String author, int yop){
        this.BId = id;
        this.BName = name;
        this.BAuthor = author;
        this.yop = yop;
    }
    public Book() {}
	// add getters and setters
    public int getBId() {
        return BId;
    }
    public void setBId(int bId) {
        BId = bId;
    }
    public int getYop() {
        return yop;
    }
    public void setYop(int yop) {
        this.yop = yop;
    }
    public String getBName() {
        return BName;
    }
    public void setBName(String bName) {
        BName = bName;
    }
    public String getBAuthor() {
        return BAuthor;
    }
    public void setBAuthor(String bAuthor) {
        BAuthor = bAuthor;
    }
    public String toString() {
        return "Book (Book Id=" + BId + ", Year of Publication=" + yop + ", Book Name=" + BName + ", Book Author=" + BAuthor + ")";
    }
}
