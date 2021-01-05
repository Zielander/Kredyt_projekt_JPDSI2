package biblioteka.jsf.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import biblioteka.jsf.entities.Ksiazka;

@Stateless
public class KsiazkaDAO {

	@PersistenceContext
	EntityManager em;
	
	public void create(Ksiazka ksiazka) {
		em.persist(ksiazka);
	}

	public Ksiazka merge(Ksiazka ksiazka) {
		return em.merge(ksiazka);
	}

	public void remove(Ksiazka ksiazka) {
		em.remove(em.merge(ksiazka));
	}

	public Ksiazka find(Object id) {
		return em.find(Ksiazka.class, id);
	}

}
