package cz.metacentrum.perun.core.api;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cz.metacentrum.perun.core.api.exceptions.InternalErrorException;
import cz.metacentrum.perun.core.api.exceptions.rt.InternalErrorRuntimeException;
import cz.metacentrum.perun.core.impl.PerunSessionImpl;

/**
 * Encapsulates context of user's interaction with the Perun system.
 *
 */
public abstract class PerunSession {

	private PerunPrincipal principal;
	private PerunClient client;
	private Perun perun;
	private Session session;
	private Query<UserExtSource> userExtSourceQuery;
	private Query<Group> getSubGroupsQuery;
	private Query<Long> userExtSourceExistsQuery1;
	private Query<Long> userExtSourceExistsQuery2;
	private Query<Long> groupExistsQuery;
	private Query<Long> subGroupExistsQuery;

	public Query<Long> getSubGroupExistsQuery() {
		return subGroupExistsQuery;
	}

	public void setSubGroupExistsQuery(Query<Long> subGroupExistsQuery) {
		this.subGroupExistsQuery = subGroupExistsQuery;
	}

	public Query<Long> getGroupExistsQuery() {
		return groupExistsQuery;
	}

	public void setGroupExistsQuery(Query<Long> groupExistsQuery) {
		this.groupExistsQuery = groupExistsQuery;
	}

	public Query<Long> getUserExtSourceExistsQuery1() {
		return userExtSourceExistsQuery1;
	}

	public void setUserExtSourceExistsQuery1(Query<Long> userExtSourceExistsQuery1) {
		this.userExtSourceExistsQuery1 = userExtSourceExistsQuery1;
	}

	public Query<Long> getUserExtSourceExistsQuery2() {
		return userExtSourceExistsQuery2;
	}

	public void setUserExtSourceExistsQuery2(Query<Long> userExtSourceExistsQuery2) {
		this.userExtSourceExistsQuery2 = userExtSourceExistsQuery2;
	}

	public Query<UserExtSource> getUserExtSourceQuery() {
		return userExtSourceQuery;
	}

	public void setUserExtSourceQuery(Query<UserExtSource> userExtSourceQuery) {
		this.userExtSourceQuery = userExtSourceQuery;
	}

	public Query<Group> getGetSubGroupsQuery() {
		return getSubGroupsQuery;
	}

	public void setGetSubGroupsQuery(Query<Group> getSubGroupsQuery) {
		this.getSubGroupsQuery = getSubGroupsQuery;
	}



	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		if (this.session == null || !this.session.isOpen()) {
			this.session = session;
		}

	}


	final static Logger log = LoggerFactory.getLogger(PerunSessionImpl.class);

	/**
	 * Constructor.
	 *
	 * @param perun     Perun
	 * @param principal identification of the actor, who will perform operations.
	 * @param client	represents client who communicates with Perun.
	 * @throws InternalErrorRuntimeException if any parametr is null
	 */
	public PerunSession(Perun perun, PerunPrincipal principal, PerunClient client) {
		if (perun == null) throw new InternalErrorRuntimeException(new NullPointerException("perun is null"));
		if (principal == null) throw new InternalErrorRuntimeException(new NullPointerException("principal is null"));
		if (client == null) throw new InternalErrorRuntimeException(new NullPointerException("client is null"));
		this.principal = principal;
		this.perun = perun;
		this.client = client;
	}

	public PerunPrincipal getPerunPrincipal() {
		return principal;
	}

	public PerunClient getPerunClient() {
		return client;
	}

	public Perun getPerun() {
		return perun;
	}

	public void destroy() throws InternalErrorException {
		perun = null;
		principal = null;
	}

	public void validate() throws InternalErrorException {
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ":[" +"principal='" + principal + "', client='"+client+"']";
	}

	public String getLogId() {
		return principal.getActor();
	}
}
