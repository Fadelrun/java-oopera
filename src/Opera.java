public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(String title, int duration, Director director,
                 Person musicAuthor, String librettoText, int choirSize) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choirSize = choirSize;
    }

    @Override
    public void printLibretto() {
        super.printLibretto();
        System.out.println("Количество человек в хоре: " + choirSize);
    }
}
