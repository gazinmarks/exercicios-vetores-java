package entities;

public class PessoaExercicio10 {

    private String name;
    private double firstNote;
    private double secondNote;

    public PessoaExercicio10 (String name, double firstNote, double secondNote){
        this.name = name;
        this.firstNote = firstNote;
        this.secondNote = secondNote;
    }

    public String getName(){
        return name;
    }

    public double getFirstNote(){
        return firstNote;
    }

    public double getSecondNote(){
        return secondNote;
    }

    public String toString(){
        return name;
    }

}
