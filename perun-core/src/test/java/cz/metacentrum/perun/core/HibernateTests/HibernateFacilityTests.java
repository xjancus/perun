package cz.metacentrum.perun.core.HibernateTests;

import cz.metacentrum.perun.core.AbstractPerunIntegrationTest;
import cz.metacentrum.perun.core.api.Facility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HibernateFacilityTests extends AbstractPerunIntegrationTest {
	private static final String CLASS_NAME = "FacilityManager.";

	@Test
	public void getAll() throws Exception {
		System.out.println(CLASS_NAME + "getAll");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		List<Facility> facilities = session.createQuery("select f from Facility f", Facility.class).getResultList();

		tx.commit();
		session.close();

		System.out.println(facilities);
		assertNotNull(facilities);
	}

	@Test
	public void getFacilityById() throws Exception {
		System.out.println(CLASS_NAME + "getFacilityById");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Facility f = session.find(Facility.class, 1041);

		tx.commit();
		session.close();

		System.out.println(f);
		assertNotNull(f);
		assertEquals("META-perian.ncbr.muni.cz", f.getName());

	}
}
