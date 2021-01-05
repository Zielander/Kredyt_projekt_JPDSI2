package biblioteka.jsf.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import biblioteka.jsf.entities.KsiazkaPK;

@Stateless
public class KsiazkaPKDAO {

	@PersistenceContext
	EntityManager em;
	
	public void create(KsiazkaPK ksiazkapk) {
		em.persist(ksiazkapk);
	}

	public KsiazkaPK merge(KsiazkaPK ksiazkapk) {
		return em.merge(ksiazkapk);
	}

	public void remove(KsiazkaPK ksiazkapk) {
		em.remove(em.merge(ksiazkapk));
	}

	public KsiazkaPK find(Object id) {
		return em.find(KsiazkaPK.class, id);
	}

}
