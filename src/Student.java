
public class Student extends Persoana {
    private int id;

    public Student(String nume, int id) {
        super(nume);
        this.id= id;
    }

    @Override
    public void salut() {
        System.out.println("Salut "+ super.getNume() + ", " + "ID:" + id);
    }
}
