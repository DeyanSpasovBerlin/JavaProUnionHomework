package Summary_24_01_2025;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
  private String  title;
    private String   author;
    private String   isbn;
    private Integer availableCopies;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(Integer availableCopies) {
        this.availableCopies = availableCopies;
    }

    public boolean isAvaliableNow(Book book){
        boolean flagisAvaliableNow;
        if(book.getAvailableCopies() > 0){
            flagisAvaliableNow = true;
        }else {
            flagisAvaliableNow = false;
        }
        return flagisAvaliableNow;
    }


}
