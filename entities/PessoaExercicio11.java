package entities;

public class PessoaExercicio11 {

    private double height;
    private char gender;

    public PessoaExercicio11(double height, char gender) {
        this.height = height;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public static double higherHeight(PessoaExercicio11[] vect) {
        for (int i = 0; i < vect.length - 1; i++) {
            for (int j = 0; j < vect.length - 1 - i; j++) {
                PessoaExercicio11 aux = vect[j];
                if (vect[j].getHeight() > vect[j + 1].getHeight()) {
                    vect[j] = vect[j + 1];
                    vect[j + 1] = aux;
                }
            }
            return vect[i + 1].getHeight();
        }
        return vect[0].getHeight();
    }
}