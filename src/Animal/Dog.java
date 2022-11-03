package Animal;

//extends er et keyword der nedarver fra Animal klassen. Derfor er denne klasse en subklasse
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String animalSound() {
        return "Woof";
    }

    public String Begging(){
        return "Begging";
    }

    @Override
    public String toString() {
        return super.toString() + Begging();
    }
}
