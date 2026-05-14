import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirector() {
        System.out.println("Режиссёр: " + director.getFullName());
    }

    public void printListOfActors() {
        System.out.println("Актёры спектакля \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println(" - " + actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor.getName() + " " + actor.getSurname() + " уже добавлен в спектакль \"" + title + "\"");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor.getName() + " " + actor.getSurname() + " добавлен в спектакль \"" + title + "\"");
        }
    }

    public void replaceActor(Actor actor, String surnameToReplace) {
        boolean found = false;
        for (int index = 0; index < listOfActors.size(); index++) {
            if (listOfActors.get(index).getSurname().equals(surnameToReplace)) {
                listOfActors.set(index, actor);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Предупреждение: Актёр с фамилией \"" + surnameToReplace + "\" не найден в спектакле \"" + title + "\"");
        }
    }

    public String getTitle() {
        return title;
    }
}
