public class Image extends Element{
    private String imagName;


    public Image(String imagName){
        this.imagName=imagName;
    }

    public String getImagName() {
        return imagName;
    }

    @Override
    public void print() {
        System.out.println("Image with name: "+this.getImagName());
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
