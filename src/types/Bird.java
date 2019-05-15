package types;

import animal_qualities.Flying;
import main.Animal;

public class Bird extends Animal implements Flying {

    public Bird(){
        super("Birds ", "a lot of monkey types");
    }
    public Bird(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "Squaking noises";
    }
    public String eat()
    {
        return "worms, and seeds";
    }
    public String Fly()
    {
        return "Fly around with ease";
    }

}
