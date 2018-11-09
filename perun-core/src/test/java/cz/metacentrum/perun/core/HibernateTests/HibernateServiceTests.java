package cz.metacentrum.perun.core.HibernateTests;

import cz.metacentrum.perun.core.AbstractPerunIntegrationTest;
import cz.metacentrum.perun.core.api.Service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HibernateServiceTests extends AbstractPerunIntegrationTest {
	private final static String CLASS_NAME = "ServicesManager.";

	/*@Test
	public void getServices() throws Exception {
		System.out.println(CLASS_NAME + "getAll");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		List<Service> services = session.createQuery("select s from Service s", Service.class).getResultList();

		tx.commit();
		session.close();

		System.out.println(services);
		assertNotNull(services);
	}

	@Test
	public void getServiceById() throws Exception {
		System.out.println(CLASS_NAME + "getServiceById");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Service service = session.find(Service.class, 42);

		tx.commit();
		session.close();

		System.out.println(service);
		assertNotNull(service);
		assertEquals("group", service.getName());
	}

	@Test
	public void serviceExists() throws Exception {
		System.out.println(CLASS_NAME + "serviceExists");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		int numberOfExistences = session.createQuery("select count(*) from Service s where s.id=?", Long.class)
				.setParameter(0, 21)
				.getSingleResult().intValue();

		tx.commit();
		session.close();

		assertTrue(numberOfExistences == 1);
		assertNotNull(numberOfExistences);
	}*/
}
