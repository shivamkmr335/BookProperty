import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int count= s.nextInt();
        Book[] book= new Book[count];
        if(count==0){
            System.out.println("N/A");
        }
        else{
            s.nextLine().trim();
            for(int i=0;i<count;i++){
                String bookname = s.nextLine().trim();
                String aurthorname = s.nextLine().trim();
                String isbn = s.nextLine().trim();
                book[i]= new Book(bookname,aurthorname,isbn);
            }
            for(int j=0;j< book.length;j++){
                System.out.println(book[j]);
            }
        }
    }
}
