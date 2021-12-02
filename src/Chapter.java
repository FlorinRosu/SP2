import java.util.ArrayList;
import java.util.List;

public class Chapter {

    private String name;
    private List<SubChapter> subChapters=new ArrayList<SubChapter>();

    public Chapter(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }



    public int createSubChapter(String subChapterName){
        SubChapter subChapter = new SubChapter(  subChapterName );
        this.subChapters.add(subChapter);
        return this.subChapters.size()-1;
    }

    public SubChapter getSubChapter(Integer index){
        return this.subChapters.get(index);
    }

    public void print(){
        System.out.println("Chapter name"+this.getName());
        System.out.println(this.subChapters);
    }
}
