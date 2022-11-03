package AuthorBooks;
import java.util.ArrayList;
public class Authur {

    ArrayList<Book> books = new ArrayList<>();

    //Atributter
    private String name;
    private char gender;
    private String email;


    //Konstruktør
    public Authur(String name, char gender, String email){
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public Authur() {
    }

    //Setter
    public void setEmail(String email){
        this.email = email;
    }

    //Getter
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return name + "        " + gender + "        " + email + "        ";
    }
}
