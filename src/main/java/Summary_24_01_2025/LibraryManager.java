package Summary_24_01_2025;

import java.util.Optional;
import java.util.Scanner;

public class LibraryManager {
    Scanner reader = new Scanner(System.in);
    Library library;

    public void borrowBookMethod(String isbn, User user){
        if(library.checkIfBookIsbnExist(isbn) && library.checkIfUserExist(user)) {
            Optional<Book> borrowBook = library.findBookByIsbn(isbn);
            int tempCopy = borrowBook.get().getAvailableCopies();
            if (borrowBook.get().isAvaliableNow(borrowBook.get())) {
                user.borrowBook(borrowBook);
                borrowBook.get().setAvailableCopies(tempCopy - 1);
            } else {
                System.out.println((borrowBook.get().getTitle() + " is not avalibla for borrowig at this moment!!"));
            }
        }else {
            System.out.println("Error! User or Isbn false!");
        }
    }

    public void returnBook(String isbn, User user){
        if(library.checkIfBookIsbnExist(isbn) && library.checkIfUserExist(user)) {
            Optional<Book> returnBook = library.findBookByIsbn(isbn);
            user.returnBook(returnBook);
            int tempCopy = returnBook.get().getAvailableCopies();
            returnBook.get().setAvailableCopies(tempCopy + 1);
        }else {
            System.out.println("Error! User or Isbn false!");
        }
    }

    public void registerUser(User user){
        if(!library.checkIfUserExist(user)) {
            library.registerUser(user);
            System.out.println("Register new user: " + user);
        }else {
            System.out.println("The user with id= " + user.getUserId() + " allredy exist!");
        }
    }

    public void addBook(Book book){
        if(!library.checkIfBookExist(book)) {
            library.addBook(book);
            System.out.println("Register new book: " + book);
        }else {
            System.out.println("The book with title " + book.getTitle() + " allredy exist!");
        }
    }

    public void removeBook(Book book){
        if(book.isAvaliableNow(book)) {
            boolean flagCanRemove = true;
            int tempCopy = book.getAvailableCopies();
            while(flagCanRemove) {
                System.out.println(("Now in library we have " + tempCopy + " copy from " + book.getTitle()));
                System.out.println("Choose how many copy to remove:");
                int numberCopyForRemove = Integer.parseInt(reader.nextLine());
                if (numberCopyForRemove < tempCopy) {
                    book.setAvailableCopies(tempCopy - numberCopyForRemove);
                    flagCanRemove = false;
                } else if (numberCopyForRemove == tempCopy) {
                    book.setAvailableCopies(0);
                    System.out.println("The book " + book.getTitle() + " is not more avaliable in our Library!");
                    library.removeBook(book);
                    flagCanRemove = false;
                } else {
                    System.out.println("Insert number <= " + tempCopy + " !");
                }
            }
        }else{
            System.out.println((book.getTitle() + " is not avalibla for removing at this moment becouse" +
                    "all book are in kunden!!"));
        }
    }

    public LibraryManager(Library library) {
        this.library = library;
    }
}
