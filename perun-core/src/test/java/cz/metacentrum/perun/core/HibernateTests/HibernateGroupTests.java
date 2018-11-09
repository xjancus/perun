package cz.metacentrum.perun.core.HibernateTests;

import cz.metacentrum.perun.core.AbstractPerunIntegrationTest;
import cz.metacentrum.perun.core.api.Group;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;

public class HibernateGroupTests extends AbstractPerunIntegrationTest {
	private final static String CLASS_NAME = "GroupsManager.";

	/*@Test
	public void getAllGroups() throws Exception {
		System.out.println(CLASS_NAME + "getAll");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		List<Group> groups = session.createQuery("select g from Group g", Group.class).getResultList();

		tx.commit();

		session.close();
		System.out.println(groups);
		assertNotNull(groups);
	}

	@Test
	public void getSubGroups() throws Exception {
		System.out.println(CLASS_NAME + "getSubGroups");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		List<Group> subgroups = session.createQuery("select g from Group g where g.parentGroupId=? order by g.name"  , Group.class)
				.setParameter(0, 4661)
				.getResultList();

		tx.commit();
		session.close();

		System.out.println(subgroups);
		assertNotNull(subgroups);
		assertEquals(95, subgroups.size());
	}

	@Test
	public void getGroupById() {
		System.out.println(CLASS_NAME + "getGroupById");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Group group = session.find(Group.class, 4661);

		tx.commit();
		session.close();

		System.out.println(group);
		assertNotNull(group);
		assertEquals("RT", group.getName());
	}*/
}
