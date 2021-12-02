import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors=new ArrayList<Author>();
    private List<Chapter> chapters=new ArrayList<Chapter>();




    public Book(String title){
        this.title=title;
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }

    public int createChapter(String chapterName){
        Chapter chapter = new Chapter( chapterName );
        this.chapters.add(chapter);
        return this.chapters.size()-1;
    }

    public Chapter getChapter(Integer index){
        return this.chapters.get(index);
    }

    public void print(){
        System.out.println(this.title);
        System.out.println(this.authors);
        System.out.println(this.chapters);


    }


}
