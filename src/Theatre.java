public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 185);
        Actor actor2 = new Actor("Алла", "Сурикова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Алексей", "Костров", Gender.MALE, 180);

        Director director1 = new Director("Константин", "Станиславский", Gender.MALE, 15);
        Director director2 = new Director("Елена", "Альховская", Gender.FEMALE, 8);

        String choreographer = "Михаил Нелипа";
        String musicAuthor = "Пётр Чайковский";

        Show ordinaryShow = new Show("Вишнёвый сад", 180, director1);
        ordinaryShow.printDirector();
        Opera opera = new Opera("Евгений Онегин", 210, director2, musicAuthor, "Либретто оперы Евгений Онегин...", 25);
        opera.printDirector();
        Ballet ballet = new Ballet("Лебединое озеро", 150, director1, musicAuthor, "Либретто балета Лебединое озеро...", choreographer);
        ballet.printDirector();

        System.out.println("\nСоздание и заполнение спектаклей");

        System.out.println("\nОбычный спектакль\n");
        ordinaryShow.addActor(actor1);
        ordinaryShow.addActor(actor2);
        ordinaryShow.addActor(actor3);

        System.out.println("\nОпера");
        opera.addActor(actor1);
        opera.addActor(actor3);

        System.out.println("\nБалет");
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println("\nСписки актёров после добавления\n");
        ordinaryShow.printListOfActors();
        System.out.println();
        opera.printListOfActors();
        System.out.println();
        ballet.printListOfActors();

        System.out.println("\nЗамена актёра в опере\n");
        opera.replaceActor(actor2, "Петров");

        System.out.println("\nОбновлённый список актёров оперы:");
        opera.printListOfActors();

        System.out.println("\nПопытка замены несуществующего актёра\n");
        ballet.replaceActor(actor1, "НесуществующаяФамилия");

        System.out.println("\nЛибретто спектаклей\n");
        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();
    }
}
