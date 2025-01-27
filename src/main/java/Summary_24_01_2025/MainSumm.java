package Summary_24_01_2025;

public class MainSumm {
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println(("Library befor all action: " + library));
        User newUser = new User("John",66);
        LibraryManager manager = new LibraryManager(library);
        manager.registerUser(newUser);
        System.out.println("------------------");
        Book siddhartha = new Book("Siddhartha","Hermann Hesse","9780976072645 Paperback",3);
        manager.addBook(siddhartha);
        System.out.println(("Library after add 1 user and i book : " + library));
        System.out.println("------------------");
        manager.borrowBookMethod("9780976072645 Paperback",newUser);
        System.out.println(("Library after newUser borrowed Sidharta book: " + library));
        System.out.println("------------------");
        manager.returnBook("9780976072645 Paperback",newUser);
        System.out.println(("Library after newUser returned Sidharta book: " + library));
        System.out.println("------------------");
        manager.removeBook(siddhartha);
        System.out.println(("Library after manager removed Sidharta book: " + library));
        System.out.println("------------------");
        System.out.println("In lybrary rest "+library.findBookByIsbn("9780976072645 Paperback"));
        System.out.println("------------------");
        manager.borrowBookMethod("9780976072645 *****",newUser);
        System.out.println("------------------");
        User newUser1 = new User("Ben",66);
        manager.registerUser(newUser1);
        System.out.println("------------------");
        User newUser2 = new User("Ben",96);
        manager.registerUser(newUser2);
        manager.borrowBookMethod("9780976072645 Paperback",newUser2);
        manager.removeBook(siddhartha);
        System.out.println("------------------");
        Book ImWestenNichtsNeues = new Book("Im Westen nichts Neues","Erich Maria Remarque","9789510489987 Audiobook",2);
        manager.addBook(ImWestenNichtsNeues);
        System.out.println(("Library after add new book : " + library));
    }
}
