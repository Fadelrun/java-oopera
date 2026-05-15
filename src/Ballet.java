public class Ballet extends MusicalShow {
    private final Person choreographer;

    public Ballet(String title, int duration, Director director,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choreographer = choreographer;
    }

    @Override
    public void printLibretto() {
        super.printLibretto();
        System.out.println("Хореограф: " + choreographer.getFullName());
    }
}
