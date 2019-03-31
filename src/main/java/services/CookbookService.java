package services;

import entities.Cookbook;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.awt.print.Book;
import java.util.List;

public class CookbookService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpalab");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();

    public Cookbook createCookbook(long isbn, String bookName, String authorLastName, String authorFirstName) {
        Cookbook cookbook = new Cookbook();
        cookbook.setIsbn(isbn);
        cookbook.setBookName(bookName);
        cookbook.setAuthorFirstName(authorFirstName);
        cookbook.setAuthorLastName(authorLastName);

        tx.begin();
        em.persist(cookbook);
        tx.commit();

        return cookbook;
    }

    public Cookbook createCookbook(Cookbook cookbook){
        tx.begin();
        em.persist(cookbook);
        tx.commit();

        return cookbook;
    }

    public Cookbook findCookbook(Long id) {
        return em.find(Cookbook.class, id);
    }

    public List<Cookbook> findAllCookbooks(){
        return null;
    }

//    public Cookbook updateCookbook(Long id, int isbn, String bookName, String authorLastName, String authorFirstName){
//        Cookbook cookbook = findCookbook(id);
//        cookbook.setIsbn(isbn);
//        cookbook.setBookName(bookName);
//        cookbook.setAuthorFirstName(authorFirstName);
//        cookbook.setAuthorLastName(authorLastName);
//
//        tx.begin();
//        cookbook.
//    }

    public void removeBook(Long id) {
        Cookbook cookbook = findCookbook(id);
        if(cookbook != null){
            tx.begin();
            em.remove(cookbook);
            tx.commit();
        }
    }

}
