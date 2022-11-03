package Animal;

//extends er et keyword der nedarver fra Animal klassen. Derfor er denne klasse en subklasse
public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String animalSound() {
        return "Meow";
    }

    //Scratching metode
    public String Scratching(){
        return "Scratching";
    }

    @Override
    public String toString() {
        return super.toString() + Scratching();
    }
}
