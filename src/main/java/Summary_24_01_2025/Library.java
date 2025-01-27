package Summary_24_01_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Library {
  private List<Book> allBooks;
    private List<User> allUsers;

    public  void addBook(Book book){
        allBooks.add(book);
    }

    public  void removeBook(Book book){
        allBooks.remove(book);
    }

    public  void registerUser(User user){
        allUsers.add(user);
    }

    public Optional<Book> findBookByIsbn(String isbn){
        Book searcBook = new Book();
        for( Book b:allBooks) {
            if (Objects.equals(b.getIsbn(), isbn)) {
                 searcBook = b;
                break;
            } else {
                continue;
            }
        }
        return Optional.of(searcBook);
    }

    public Library() {
        this.allBooks = new ArrayList<>();
        this.allUsers = new ArrayList<>();
    }

    public boolean checkIfUserExist(User user){
        boolean flagIfUserExist = false;
        for (User u: allUsers) {
            if(  u.getUserId() == user.getUserId()){
                flagIfUserExist = true;
            } else {
                flagIfUserExist = false;
            }
        }
        return flagIfUserExist;
    }

    public boolean checkIfBookExist(Book book){
        boolean flagIfBookExist = false;
        for (Book b: allBooks) {
            if( Objects.equals(b.getIsbn(),book.getIsbn()) ){
                flagIfBookExist = true;
            } else {
                flagIfBookExist = false;
            }
        }
        return flagIfBookExist;
    }

    public boolean checkIfBookIsbnExist(String isbn){
        boolean flagIfBookIsbnExist = false;
        for (Book b: allBooks) {
            if( Objects.equals(b.getIsbn(),isbn)){
                flagIfBookIsbnExist = true;
            } else {
                flagIfBookIsbnExist = false;
            }
        }
        return flagIfBookIsbnExist;
    }

    @Override
    public String toString() {
        return "Library{" +
                "allBooks=" + allBooks +
                ", allUsers=" + allUsers +
                '}';
    }

}
