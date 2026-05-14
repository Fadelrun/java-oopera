public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(String title, int duration, Director director,
                  String musicAuthor, String librettoText, String choreographer) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choreographer = choreographer;
    }

    @Override
    public void printLibretto() {
        super.printLibretto();
        System.out.println("Хореограф: " + choreographer);
    }
}
