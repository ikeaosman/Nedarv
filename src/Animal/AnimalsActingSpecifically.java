package Animal;

import java.util.ArrayList;

public class AnimalsActingSpecifically {
    public void run() {

        ArrayList<Animal> animals = new ArrayList<>();

        //Opretter instancer af objekterne katte og hunde samt tildeler dem et navn
        Cat c = new Cat("Kitty");
        Cat cat = new Cat("Bicy");
        Dog d = new Dog("Max");
        Dog dog = new Dog("Maddi");


        animals.add(0, c);
        animals.add(1, cat);
        animals.add(2, d);
        animals.add(3, dog);

        //For lykke som løber igennem instancer af animal jeg har addet
        for (int i = 0; i < animals.size(); i++) {
            Animal a = animals.get(i);
            System.out.println(a);
            if (a instanceof Cat)
                ((Cat) a).Scratching();
            if (a instanceof Dog)
                ((Dog) a).Begging();

        }
    }

    //Main metode
    public static void main(String[] args) {
        new AnimalsActingSpecifically().run();
    }
}
