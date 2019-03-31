import entities.Cookbook;
import entities.Recipe;
import services.CookbookService;
import services.RecipeService;

public class Runner {

    public static void main(String ...args){

        CookbookService cookbookService = new CookbookService();
//
//        Cookbook cookbook2 = cookbookService.createCookbook(1234567890125L, "test book2.2", "Test2.2", "testy2.2");
//
//        System.out.println("Book Persisted: " + cookbook2.getId());
//
        Cookbook cookbook1 = cookbookService.findCookbook(1L);
//        System.out.println(cookbook1.getBookName());


        RecipeService recipeService = new RecipeService();
        Recipe recipe1 = recipeService.createRecipe("test", 1L, 52, 0, null);
        System.out.println("Recipe persisted: " + recipe1.getId());

    }
}
