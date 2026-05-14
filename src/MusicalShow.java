public class MusicalShow extends Show {
    private final String musicAuthor;
    private final String librettoText;

    public MusicalShow(String musicAuthor, String librettoText, String title, int duration, Director director) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto(){
        System.out.println("Либретто спектакля \"" + title + "\":");
        System.out.println(librettoText);
        System.out.println("Автор музыки: " + musicAuthor);
    }
}
