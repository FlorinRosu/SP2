public class Table extends Element{
    private String title;


    public Table(String title){
        this.title=title;
    }

    @Override
    public void print() {
        System.out.println("Table with title: "+this.title);
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
    public Element get(Integer index) {
        return null;
    }

}
