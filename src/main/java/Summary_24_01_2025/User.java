package Summary_24_01_2025;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public class User {
    private String name;
    private Integer userId;
    private List<Optional<Book>> borrowedBooks = new ArrayList<>();;

    public User(String name, Integer userId, List<Optional<Book>> borrowedBooks) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = borrowedBooks;
    }

    public User() {}

    public List<Optional<Book>> getBorrowedBooks() {
        return borrowedBooks;
    }

    public Integer getUserId() {
        return userId;
    }

    public void borrowBook(Optional<Book> book){
        borrowedBooks.add(book);
    }
    public void returnBook(Optional<Book> book){
        borrowedBooks.remove(book);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User(String name, Integer userId) {
        this.name = name;
        this.userId = userId;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId=" + userId +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
