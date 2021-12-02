import java.util.ArrayList;
import java.util.List;

public class SubChapter {

    private String name;
    private List<Paragraph> paragraphs=new ArrayList<Paragraph>();
    private List<Image> images=new ArrayList<Image>();
    private List<Table> tables=new ArrayList<Table>();


    public SubChapter(String name){
        this.name=name;
    }

    public void createNewImage(String imageName){
        Image image = new Image(  imageName );
        this.images.add(image);
    }

    public void createNewParagraph(String paragraphName){
        Paragraph paragraph = new Paragraph(  paragraphName );
        this.paragraphs.add(paragraph);
    }
    public void createNewTable(String tableName){
        Table table = new Table(  tableName );
        this.tables.add(table);
    }

    public void print(){
        System.out.println("Subchapter: "+this.name);

        for(Paragraph paragraph : this.paragraphs){
           paragraph.print();
        }
        for(Image image : this.images){
            image.print();
        }
        for(Table table : this.tables){
            table.print();
        }
    }
}
