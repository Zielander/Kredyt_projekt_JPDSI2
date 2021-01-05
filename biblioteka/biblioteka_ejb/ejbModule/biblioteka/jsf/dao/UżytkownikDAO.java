package biblioteka.jsf.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import biblioteka.jsf.entities.U�ytkownik;

@Stateless
public class U�ytkownikDAO {

	@PersistenceContext
	EntityManager em;
	
	public void create(U�ytkownik u�ytkownik) {
		em.persist(u�ytkownik);
	}

	public U�ytkownik merge(U�ytkownik u�ytkownik) {
		return em.merge(u�ytkownik);
	}

	public void remove(U�ytkownik u�ytkownik) {
		em.remove(em.merge(u�ytkownik));
	}

	public U�ytkownik find(Object id) {
		return em.find(U�ytkownik.class, id);
	}

}
