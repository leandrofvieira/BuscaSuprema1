package br.com.buscasuprema.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Persist<T> {

	protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("buscasuprema");
	protected EntityManager em = emf.createEntityManager();

	public Persist() {
	}

	public void inserirObjeto(Object objeto) {
		em.getTransaction().begin();
		em.persist(objeto);
		em.getTransaction().commit();
	}

	public void removerObjeto(T objeto) {
		em.getTransaction().begin();
		em.remove(objeto);
		em.getTransaction().commit();
		em.close();
	}

	public List<T> consultarObjetos(Class<T> classe) {
		List<T> t;
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery query = cb.createQuery();
		Root<T> from = query.from(classe);
		query.select(from);
		return em.createQuery(query).getResultList();
	}

	public T getObjetoById(Object id, Class classe) {
		T o;
		em.getTransaction().begin();
		o = (T) em.find(classe, id);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	public void alterarObjeto(int id, Object object) throws NoSuchFieldException, SecurityException {
		em.getTransaction().begin();
		em.find(object.getClass(), id);
		em.merge(object);
		em.getTransaction().commit();
		em.close();
	}

}