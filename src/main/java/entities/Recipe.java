package entities;

import javax.persistence.*;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue
    long id;

    @Column(name = "recipe_name", length = 100)
    String recipeName;

    @Column(name = "page")
    int page;

    @Column(name = "rating")
    int rating;

    @Column(name = "notes")
    String notes;

    public Recipe() {
    }

    public Recipe(String recipeName, int page, int rating, String notes) {
        this.recipeName = recipeName;
        this.page = page;
        this.rating = rating;
        this.notes = notes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
