import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors=new ArrayList<Author>();
    private List<Element> contents=new ArrayList<Element>();


    public Book(String title){
        this.title=title;
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }

    public void addContent(Element content){
        this.contents.add(content);
    }
    public void print(){
        System.out.println("Book:"+this.title);
        System.out.println("Authors: ");
        for(Author a:authors){
            System.out.println("Author: "+a.getName()+" ");
        }
        for(Element e:contents){
            e.print();
        }
    }
}
