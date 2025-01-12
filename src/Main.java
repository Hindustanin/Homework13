public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1867);

        Author federDostoevsky = new Author("Фёдор", "Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", federDostoevsky, 1866);

        System.out.println(warAndPeace.getTitle() + ", " + warAndPeace.getPublication() + ", " + levTolstoy.getName() + " " + levTolstoy.getSurname());
        System.out.println(crimeAndPunishment.getTitle() + ", " + crimeAndPunishment.getPublication() + ", " + federDostoevsky.getName() + " " + federDostoevsky.getSurname());

        warAndPeace.setPublication(1900);
        crimeAndPunishment.setPublication(2000);

        System.out.println();
        System.out.println(warAndPeace.getTitle() + ", " + warAndPeace.getPublication() + ", " + levTolstoy.getName() + " " + levTolstoy.getSurname());
        System.out.println(crimeAndPunishment.getTitle() + ", " + crimeAndPunishment.getPublication() + ", " + federDostoevsky.getName() + " " + federDostoevsky.getSurname());
    }
}