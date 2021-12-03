public class TableOfContent extends Element{
    private String title;

    public TableOfContent(String title){
        this.title=title;
    }

    @Override
    public void print() {
        System.out.println("Table if content: "+this.title);
    }

    @Override
    public void add(Element e) {
     System.out.println("?");
    }

    @Override
    public void remove(Element e) {
        System.out.println("?");
    }

    @Override
    public Element get(Integer e) {
        return null;
    }
}
