public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1867);

        Author federDostoevsky = new Author("Фёдор1", "Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", federDostoevsky, 1866);

        System.out.println(warAndPeace);
        System.out.println(crimeAndPunishment);
    }
}