package cz.metacentrum.perun.core.HibernateTests;


import cz.metacentrum.perun.core.AbstractPerunIntegrationTest;
import cz.metacentrum.perun.core.api.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HibernateResourceTests extends AbstractPerunIntegrationTest {
	private final static String CLASS_NAME = "ResourcesManager.";

	/*@Test
	public void getResources() throws Exception {
		System.out.println(CLASS_NAME + "getResources");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		List<Resource> resources = session.createQuery("select r from Resource r", Resource.class).getResultList();

		tx.commit();
		session.close();

		System.out.println(resources);
		assertNotNull(resources);
	}

	@Test
	public void resourceExists() throws Exception {
		System.out.println(CLASS_NAME + "resourceExists");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		int numberOfExistences = session.createQuery("Select count(*) from Resource r where r.id=?", Long.class)
				.setParameter(0, 2065)
				.getSingleResult().intValue();

		tx.commit();
		session.close();

		assertNotNull(numberOfExistences);
		assertTrue(numberOfExistences == 1);
	}
*/
}
