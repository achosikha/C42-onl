package lesson_17_lambas;

public class PersonContainer <M extends Person>{
    M member;

    public PersonContainer(M member){
        this.member = member;
    }
}
