package aplicacao;

import entities.Livros;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Livros l1 = new Livros(null,"O homem mais rico","George S.",2005,"Topmson");


            EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa-post");
            EntityManager em = enf.createEntityManager();

            em.getTransaction().begin();
            em.persist(l1);
            em.getTransaction().commit();
            System.out.println("Salvo com Sucesso");



    }
}
