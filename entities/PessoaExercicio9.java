package entities;

public class PessoaExercicio9 {

    private String name;
    private int age;

    public PessoaExercicio9(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}