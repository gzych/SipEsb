package com.gzych.sipesb.objects.dao.impl;

// default package
// Generated 2016-05-23 09:20:19 by Hibernate Tools 3.6.0

import java.util.List;
import javax.naming.InitialContext;

import com.gzych.sipesb.managers.logger.Logger;
import com.gzych.sipesb.managers.logger.LoggerFactory;
import com.gzych.sipesb.objects.dao.EpSkrytkaAdresDao;
import com.gzych.sipesb.objects.model.EpSkrytkaAdres;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Home objects for domain model class EpSkrytkaAdres.
 * @see .EpSkrytkaAdres
 * @author Hibernate Tools
 */
public class EpSkrytkaAdresHome extends HibernateDaoSupport implements EpSkrytkaAdresDao {

	private final Logger log = LoggerFactory.getLogger(getClass());

	public void persist(EpSkrytkaAdres transientInstance) {
		log.debug("persisting EpSkrytkaAdres instance");
		try {
			getHibernateTemplate().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void delete(EpSkrytkaAdres persistentInstance) {
		log.debug("deleting EpSkrytkaAdres instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EpSkrytkaAdres merge(EpSkrytkaAdres detachedInstance) {
		log.debug("merging EpSkrytkaAdres instance");
		try {
			EpSkrytkaAdres result = (EpSkrytkaAdres) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EpSkrytkaAdres findById(long id) {
		log.debug("getting EpSkrytkaAdres instance with id: " + id);
		try {
			EpSkrytkaAdres instance = (EpSkrytkaAdres) getHibernateTemplate().get("EpSkrytkaAdres", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public EpSkrytkaAdres findByCode(String skadUUID) {
		log.debug("finding EpSkrytkaAdres instance by skadUUID");
		try {
			List list = getHibernateTemplate().find(
					"from EpMetadaneDokumentu where skadUUID=?",
					skadUUID);
			log.debug("find by code successful, result size: " + list.size());
			return (EpSkrytkaAdres)list.get(0);
		} catch (RuntimeException re) {
			log.error("find by code failed", re);
			throw re;
		}
	}
}
