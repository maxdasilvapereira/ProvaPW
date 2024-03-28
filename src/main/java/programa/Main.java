package programa;

import provaloja.Produto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto(12345, "Frango","Sadia",100,"20/20/2020");
	
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		
		Produto busca1 = em.find(Produto.class, 12345);
		
		em.close();
		emf.close();

	}

}


