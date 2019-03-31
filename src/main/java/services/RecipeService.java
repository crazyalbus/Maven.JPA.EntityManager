package services;

import entities.Recipe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class RecipeService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpalab");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();

    public Recipe createRecipe(String recipeName, long cookbookID, int page, int rating, String notes){
        Recipe recipe = new Recipe();
        recipe.setRecipeName(recipeName);
        recipe.setCookbookID(cookbookID);
        recipe.setPage(page);
        recipe.setRating(rating);
        recipe.setNotes(notes);

        tx.begin();
        em.persist(recipe);
        tx.commit();

        return recipe;
    }

    public Recipe createRecipe(Recipe recipe){
        tx.begin();
        em.persist(recipe);
        tx.commit();

        return recipe;
    }

    public Recipe findRecipe(Long id) {
        return em.find(Recipe.class, id);
    }

    public List<Recipe> findAllRecipes(){
        return null;
    }

//    public Recipe updateRecipe(String recipeName, long cookbookID, int page, int rating, String notes){
//        Recipe recipe = findRecipe(id);
//        recipe.setRecipeName(recipeName);
//        recipe.setPage(page);
//        recipe.setRating(rating);
//        recipe.setNotes(notes);
//
//        tx.begin();
//        recipe.
//    }

    public void removerecipe(Long id) {
        Recipe recipe = findRecipe(id);
        if(recipe != null){
            tx.begin();
            em.remove(recipe);
            tx.commit();
        }
    }


}
