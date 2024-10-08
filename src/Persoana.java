import Interfete.Om;

public class Persoana implements Om {
    private String nume;

    public Persoana(String nume) {
        this.nume = nume;
    }

    public void salut() {
        System.out.println("Salut sunt " + nume);
    }

    protected String getNume(){
        return nume;
    }
    public void invata(){
        System.out.println(nume + " Invata");
    }
}
