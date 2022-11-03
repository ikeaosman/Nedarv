package AuthorBooks;

public class Book extends Authur{
    //Atributter
    private String title;
    private Authur authur;
    private int pageNumber;

    //Konstruktør

    public Book(String title, Authur authur, int pageNumber){
        this.title = title;
        this.authur = authur;
        this.pageNumber = pageNumber;
    }

    //Getter
    public String getTitle(){
        return title;
    }
    public Authur getAuthur(){
        return authur;
    }
    public int getPageNumber(){
        return pageNumber;
    }
}
