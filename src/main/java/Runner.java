import entities.Cookbook;
import services.CookbookService;

public class Runner {

    public static void main(String ...args){

        CookbookService cookbookService = new CookbookService();
////
//        Cookbook cookbook2 = cookbookService.createCookbook(1234567890125L, "test book2.2", "Test2.2", "testy2.2");
//
//        System.out.println("Book Persisted: " + cookbook2.getId());

        Cookbook cookbook1 = cookbookService.findCookbook(1L);
        System.out.println(cookbook1.getBookName());
    }
}
