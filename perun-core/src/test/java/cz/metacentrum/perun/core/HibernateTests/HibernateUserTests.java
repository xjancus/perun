package cz.metacentrum.perun.core.HibernateTests;

import cz.metacentrum.perun.core.AbstractPerunIntegrationTest;
import cz.metacentrum.perun.core.api.User;
import cz.metacentrum.perun.core.api.UserExtSource;
import cz.metacentrum.perun.core.bl.UsersManagerBl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HibernateUserTests extends AbstractPerunIntegrationTest {

	private final static String CLASS_NAME = "UsersManager.";

	private UsersManagerBl um;

	/*@Test
	public void getAll() throws Exception {
		System.out.println(CLASS_NAME + "getUsers");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		List<User> users = session.createQuery("select u from User u", User.class).getResultList();

		tx.commit();
		session.close();

		System.out.println(users);
	}

	@Test
	public void getUserById() throws Exception {
		System.out.println(CLASS_NAME + "getUserById");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int id = 3273;

		User u = session.find(User.class, id);

		tx.commit();
		session.close();

		System.out.println(u);
		assertNotNull(u);
		assertEquals("PavelZitek", u.getFirstName() + u.getLastName());
	}


	@Test
	public void getUserExtSources() throws Exception {
		System.out.println(CLASS_NAME + "getUserExtSources");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		List<UserExtSource> userExtSources = session.createQuery("select u From UserExtSource u where u.userId=?", UserExtSource.class)
				.setParameter(0,3192).getResultList();

		tx.commit();
		session.close();

		System.out.println(userExtSources);
		assertNotNull(userExtSources);
		assertEquals(10, userExtSources.size());

	}

	@Test
	public void UserExtSourceExists() throws Exception {
		System.out.println(CLASS_NAME + "userExtSourceExists");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		int numberOfExistences = session.createQuery("select count(*) from UserExtSource u where u.login=? and u.extSource.id=?", Long.class)
				.setParameter(0, "zelinka")
				.setParameter(1, 2)
				.getSingleResult().intValue();


		assertNotNull(numberOfExistences);
		assertTrue(numberOfExistences == 1);
	}*/

}
