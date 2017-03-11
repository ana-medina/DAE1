package mx.uerre.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "books")
@NamedQueries({
    @NamedQuery(name = "Book.findByTitle",
        query = "SELECT b FROM Book b WHERE b.title = ?1"),
    @NamedQuery(name = "Book.findByIsbn",
        query = "SELECT b FROM Book b WHERE b.isbn = ?1")
})
public class Book implements Serializable {

    @Id
    @Column(name = "isbn", unique = true, nullable = false, length = 14)
    private String isbn;

    @Column(name = "title", nullable = false)
    private String title;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_publication", length = 0)
    private Date dateOfPublication;

    public Book() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(Date dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Book [isbn=").append(isbn).append(", ");
        sb.append("title=").append(title).append(", ");
        sb.append("dateOfPublication=").append(dateOfPublication).append("]");

        return sb.toString();
    }
}