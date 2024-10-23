public class Masterand extends Student{

    public Masterand(Specializare specializare) {
        super(specializare);
    }
    public void saluta(){
        System.out.println("Buna sunt Masterand la "+ specializare+"!");
    }
}
