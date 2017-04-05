package com.gzych.sipesb.objects.dao.impl;

// default package
// Generated 2016-05-23 09:20:19 by Hibernate Tools 3.6.0

import java.util.List;
import java.util.Set;
import javax.naming.InitialContext;

import com.gzych.sipesb.objects.dao.EpDaneNadawcyDao;
import com.gzych.sipesb.objects.model.EpDaneNadawcy;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import com.gzych.sipesb.managers.logger.Logger;
import com.gzych.sipesb.managers.logger.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Home objects for domain model class EpDaneNadawcy.
 * @see .EpDaneNadawcy
 * @author Grzegorz Zych
 */
public class EpDaneNadawcyHome extends HibernateDaoSupport implements EpDaneNadawcyDao {

	private final Logger log = LoggerFactory.getLogger(getClass());

	public void persist(EpDaneNadawcy transientInstance) {
		log.debug("persisting EpDaneNadawcy instance");
		try {
			getHibernateTemplate().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void delete(EpDaneNadawcy persistentInstance) {
		log.debug("deleting EpDaneNadawcy instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EpDaneNadawcy merge(EpDaneNadawcy detachedInstance) {
		log.debug("merging EpDaneNadawcy instance");
		try {
			EpDaneNadawcy result = getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EpDaneNadawcy findById(long id) {
		log.debug("getting EpDaneNadawcy instance with id: " + id);
		try {
			EpDaneNadawcy instance = (EpDaneNadawcy) getHibernateTemplate().get("EpDaneNadawcy", id);
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

	public EpDaneNadawcy findByCode(String danaUUID) {
		log.debug("finding EpDaneNadawcy instance by code");
		try {
			List list = getHibernateTemplate().find(
					"from EpDaneNadawcy where danaUUID=?",
					danaUUID);
			log.debug("find by code successful, result size: " + list.size());
			return (EpDaneNadawcy)list.get(0);
		} catch (RuntimeException re) {
			log.error("find by code failed", re);
			throw re;
		}
	}
}
