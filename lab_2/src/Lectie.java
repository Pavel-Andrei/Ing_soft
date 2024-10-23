public class Lectie <T>{
    private T persoana;
    public Lectie(T persoana){
        this.persoana = persoana ;
    }

    public void invata(){
        System.out.println("Lectie cu "+persoana.getClass().getName());
    }
}
