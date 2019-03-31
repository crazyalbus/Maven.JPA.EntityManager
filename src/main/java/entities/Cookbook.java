package entities;

import javax.persistence.*;

@Entity
@Table(name = "cookbook")
public class Cookbook {
    @Id
    @GeneratedValue()
    private Long id;

    @Column(name="isbn", length=13)
    private long isbn;

    @Column(name="book_name", length=100)
    private String bookName;

    @Column(name="author_last_name", length=30)
    private String authorLastName;

    @Column(name="author_first_name", length=30)
    private String authorFirstName;

    public Cookbook() {
    }

    public Cookbook(long isbn, String bookName, String authorLastName, String authorFirstName) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }
}
