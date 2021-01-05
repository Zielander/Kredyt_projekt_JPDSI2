package biblioteka.jsf.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import biblioteka.jsf.entities.Gatunek;

@Stateless
public class GatunekDAO {

	@PersistenceContext
	EntityManager em;
	
	public void create(Gatunek gatunek) {
		em.persist(gatunek);
	}

	public Gatunek merge(Gatunek gatunek) {
		return em.merge(gatunek);
	}

	public void remove(Gatunek gatunek) {
		em.remove(em.merge(gatunek));
	}

	public Gatunek find(Object id) {
		return em.find(Gatunek.class, id);
	}

}
