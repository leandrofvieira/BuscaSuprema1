package br.com.buscasuprema.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory manager = Persistence.createEntityManagerFactory("buscasuprema");
	
	public EntityManager getEntityManager() {
		return manager.createEntityManager();
	}
	
	public void commit(Object object) {
		EntityManager manager = getEntityManager();
		manager.getTransaction().begin();
		manager.persist(object);
		manager.getTransaction().commit();
		manager.close();
		

	}
	
	
	
	public JPAUtil(){
				
	}
	
	
}
