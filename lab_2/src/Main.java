import java.util.*;

public class Main {
    public static void main(String[] args) {
    Student std= new Student(Specializare.Calculatoare);
    std.saluta();

    Masterand mst= new Masterand(Specializare.TI);
    mst.saluta();

    Lectie<Student> s =new Lectie<>(new Student(Specializare.ISM));
    Lectie<Masterand> m =new Lectie<>(new Masterand(Specializare.Calculatoare));
    s.invata();
    m.invata();

//    List<Student> grupa = new ArrayList<>();
    List<Student> grupa = new LinkedList<>();
    grupa.add(new Student(Specializare.ISM));
    grupa.add(new Student(Specializare.TI));
    grupa.add(new Masterand(Specializare.Calculatoare));

    for(Student st:grupa){
        st.saluta();
    }

    }
}