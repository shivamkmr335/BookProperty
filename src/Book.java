public class Book {
    private String bookname;
    private String aurthorname;
    private String isbn;
    public String getBookname(){
        return bookname;
    }
    public String getAurthorname(){
        return aurthorname;
    }
    public String getIsbn(){
        return isbn;
    }

    public String toString(){
        return "-----------------------------\n" + "Book Name:\t" + bookname + "\n" + "Author Name:\t" + aurthorname + "\n" + "ISBN:\t" + isbn + "\n" + "-----------------------------";
    }
    public Book(String Bookname, String Aurthorname, String Isbn){
        this.bookname= Bookname;
        this.aurthorname= Aurthorname;
        this.isbn= Isbn;
    }
}
