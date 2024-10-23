public class Student{

    protected Specializare specializare;
    public Student(Specializare specializare){
        this.specializare = specializare;
    }
    public void saluta(){
        System.out.println("Buna sunt student la "+ specializare+"!");
    }
    public void specializare(){

    }
}
