package biblioteka.jsf.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import biblioteka.jsf.entities.U퓓tkownik;

@Stateless
public class U퓓tkownikDAO {

	@PersistenceContext
	EntityManager em;
	
	public void create(U퓓tkownik u퓓tkownik) {
		em.persist(u퓓tkownik);
	}

	public U퓓tkownik merge(U퓓tkownik u퓓tkownik) {
		return em.merge(u퓓tkownik);
	}

	public void remove(U퓓tkownik u퓓tkownik) {
		em.remove(em.merge(u퓓tkownik));
	}

	public U퓓tkownik find(Object id) {
		return em.find(U퓓tkownik.class, id);
	}

}
