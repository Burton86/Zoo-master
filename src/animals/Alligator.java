package animals;


import types.Reptile;
import animal_qualities.Swimming;

/**
 * Write a description of class Animals.Alligator here.
 *
 * @author (Kyle Burton)
 * @version (5/10/19)
 */
public class Alligator extends Reptile implements Swimming {
    // instance variables - replace the example below with your own
    private int x;

    public Alligator() {
        super("Alligator", "visciously roars and is dangerous");
    }

    @Override
    public String Swim() {
        return "swims in circle looking for food";
    }
}