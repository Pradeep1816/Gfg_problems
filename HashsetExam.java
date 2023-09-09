
import java.util.*;
class Book {
    int id;
    String name,auther,publisher;
    int quantity;
    Book(int id,String name,String auther,String publisher,int
    quantity){
        this.id=id;
        this.name=name;
        this.auther=auther;
        this.publisher=publisher;
        this.quantity=quantity;
        
    }
}
class HashsetExam{
    public static void main(String[] args) {
         HashSet<Book> set=new HashSet<Book>();
        Book b1=new Book(101,"let us c","yashwant kanetkar","BPB",8);
       
        set.add(b1);
        for(Book b:set)
          System.out.print(b.id+""+b.name+""+b.auther+""+b.auther+""+b.publisher);
    }
}