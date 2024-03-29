package net.codejava;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BooksManager {
	static EntityManagerFactory factory;
	static EntityManager entityManager;
	public static void main(String[] args) {
		
		begin();
		
		//create();
		//update();
		//query();
		remove();
		//Find();
		End();

	}

	
	
	private static void begin() {
		factory = Persistence.createEntityManagerFactory("BookUnit");
		entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
	}
	private static void create() {
		Book newBook = new Book();
		newBook.setTitle("effective");
		newBook.setAuthor("joshua bloch");
		newBook.setPrice(39);
		
		entityManager.persist(newBook);
	}
	private static void Find() {
		int id = 2;
		Book book = entityManager.find(Book.class, id);
		System.out.println(book.getBook_id());
		System.out.println(book.getAuthor());
		System.out.println(book.getTitle());
		System.out.println(book.getPrice());
	}
	
	private static void update() {
		Book editBook = new Book();
		editBook.setBook_id(1);
		editBook.setTitle("anh sua uong nuoc");
		editBook.setAuthor("minh");
		editBook.setPrice(39);
		
		entityManager.merge(editBook);
	}
	private static void query() {
		String sql = "select b from Book b where b.price < 40";
		Query query = entityManager.createQuery(sql);
		
		@SuppressWarnings("unchecked")
		
		List<Book> data = query.getResultList();
		for (Book b : data) {
			System.out.println(b.getBook_id() + "," +b.getTitle()+ "," +b.getPrice() );
		}
		
	}
	private static void remove() {
		int id = 2;
		Book remove = entityManager.getReference(Book.class, id);
		entityManager.remove(remove);
	}
	
	private static void End() {
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}

}
