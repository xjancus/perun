package cz.metacentrum.perun.core.HibernateTests;

import cz.metacentrum.perun.core.AbstractPerunIntegrationTest;
import cz.metacentrum.perun.core.api.Member;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HibernateMemberTests extends AbstractPerunIntegrationTest {
	private static final String CLASS_NAME = "MembersManager.";

	@Test
	public void getAll() throws Exception {
		System.out.println(CLASS_NAME + "getAll");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		List<Member> members = session.createQuery("select m from Member m", Member.class)
				.getResultList();

		tx.commit();
		session.close();

		System.out.println(members);
		assertNotNull(members);
	}

	@Test
	public void getMemberById() throws Exception {
		System.out.println(CLASS_NAME + "getMemberById");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Member member = session.createQuery("Select m from Member m where m.userId=? and m.voId=?", Member.class)
				.setParameter(0, 3166)
				.setParameter(1, 21)
				.uniqueResult();

		tx.commit();
		session.close();
		System.out.println(member);

		assertNotNull(member);
		assertEquals(3866, member.getId());

	}

}
