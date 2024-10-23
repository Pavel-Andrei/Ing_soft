import Interfete.Om;

public class Main {
    public static void main(String[] args) {
    Persoana Alex = new Persoana("Alex");
    Alex.salut();

    Student a = new Student("asdaf",23);
    a.salut();
    Persoana Bob = new Student("Bob",3128);
    Bob.salut();

        Om om = new Student("om", 234);
        om.invata();
//        om.salut();

    }
}