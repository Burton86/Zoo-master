package animals;


import types.Primate;

/**
 * Write a description of class Animals.Orangutan here.
 *
 * @author (Kyle Burton)
 * @version (5/10/19)
 */
public class Orangutan extends Primate {
    // instance variables - replace the example below with your own
    private int x;

    public Orangutan() {
        super("Orangutan", "orange and kinda friendly and intelligent");
    }
    public Orangutan(String name, String desc) {
        super(name, desc);
    }

    public String eat() {
        return "fruit";
    }
    public String makeNoise() {
        return "OOOOOOOOOOO";
    }
}