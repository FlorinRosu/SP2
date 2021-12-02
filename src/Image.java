public class Image implements Element{
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
}
