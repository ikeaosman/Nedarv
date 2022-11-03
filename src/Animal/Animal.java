package Animal;

//Abstract keyword betyder at det er Superklassen/Parent
public abstract class Animal {
    //Atributter
    private String name;

    //Konstruktør
    public Animal(String name){
        this.name = name;
    }

    //Getter
    public String getName(){
        return name;
    }
    //Setter
    public void setName(String name){
        this.name = name;
    }
    //metode
    public String animalSound(){
         return "animal Sound";
    }

    //Her bliver animal, animal name, animal sound og beggeing eller Scratching returneret
    @Override
    public String toString() {
        return "Animal:" +
                "name:'" + name + '\'' +  animalSound() +
                ' ';
    }
}
