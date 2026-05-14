public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Double.compare(actor.height, height) == 0 &&
                name.equals(actor.name) &&
                surname.equals(actor.surname);
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + " см)";
    }
}
