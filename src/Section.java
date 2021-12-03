import java.util.ArrayList;
import java.util.List;

public class Section extends Element{

    private String title;
    private List<Element> children=new ArrayList<Element>();


    public Section(String title){
        this.title=title;
    }

    @Override
    public void print() {
        System.out.println(this.title);
        for(Element e:children){
            e.print();
        }
    }

    @Override
    public void add(Element e) {
        this.children.add(e);
    }

    @Override
    public void remove(Element e) {
        this.children.remove(e);
    }

    @Override
    public Element get(Integer index) {
        return this.children.get(index);
    }
}
