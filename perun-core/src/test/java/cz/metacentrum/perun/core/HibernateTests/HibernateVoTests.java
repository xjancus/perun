package cz.metacentrum.perun.core.HibernateTests;

import cz.metacentrum.perun.core.AbstractPerunIntegrationTest;
import cz.metacentrum.perun.core.api.Vo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HibernateVoTests extends AbstractPerunIntegrationTest {
	private final static String CLASS_NAME = "VosManager.";

	/*@Test
	public void getVoById() throws Exception {
		System.out.println(CLASS_NAME + "getVoById");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Vo vo = session.find(Vo.class, 21);

		tx.commit();
		session.close();

		System.out.println(vo);
		assertNotNull(vo);
		assertEquals("MetaCentrum", vo.getName());

	}

	@Test
	public void getVos() throws Exception {
		System.out.println(CLASS_NAME + "getVos");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		List<Vo> vos = session.createQuery("select vo from Vo vo", Vo.class).getResultList();

		tx.commit();
		session.close();

		System.out.println(vos);
		assertNotNull(vos);
	}*/

}
