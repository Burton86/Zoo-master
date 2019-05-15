package animals;


import types.Primate;

/**
 * Write a description of class Animals.Chimpanzee here.
 *
 * @author (Kyle Burton)
 * @version (5/10/19)
 */
public class Chimpanzee extends Primate
{
    // instance variables - replace the example below with your own
    private String age;

    public Chimpanzee()
    {
        super("Animals.Chimpanzee", "brown and sometimes mean");
        this.age = "very young";
    }

    @Override
    public String makeNoise() {
        return "screetches and throws feces.";
    }
}