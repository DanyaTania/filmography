package testgroup.filmography.model;

public class Film {
    private int id;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    private int year;
    private String genre;


    @Override
    public  String toString(){
        return "Film: "+getTitle()+" "+getYear()+" "+getGenre();
    }

}
