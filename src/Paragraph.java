public class Paragraph extends Element{
    private String text;



    public Paragraph(String text){
        this.text=text;
    }


    @Override
    public void print() {
        System.out.println("Paragraph: "+this.text);
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
