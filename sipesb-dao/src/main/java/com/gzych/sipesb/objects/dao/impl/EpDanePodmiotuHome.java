package com.gzych.sipesb.objects.dao.impl;

// default package
// Generated 2016-05-23 09:20:19 by Hibernate Tools 3.6.0

import java.util.List;
import javax.naming.InitialContext;

import com.gzych.sipesb.managers.logger.Logger;
import com.gzych.sipesb.managers.logger.LoggerFactory;
import com.gzych.sipesb.objects.dao.EpDanePodmiotuDao;
import com.gzych.sipesb.objects.model.EpDanePodmiotu;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Home objects for domain model class EpDanePodmiotu.
 * @see .EpDanePodmiotu
 * @author Hibernate Tools
 */
public class EpDanePodmiotuHome extends HibernateDaoSupport implements EpDanePodmiotuDao {

	private final Logger log = LoggerFactory.getLogger(getClass());

	public void persist(EpDanePodmiotu transientInstance) {
		log.debug("persisting EpDanePodmiotu instance");
		try {
			getHibernateTemplate().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void delete(EpDanePodmiotu persistentInstance) {
		log.debug("deleting EpDanePodmiotu instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EpDanePodmiotu merge(EpDanePodmiotu detachedInstance) {
		log.debug("merging EpDanePodmiotu instance");
		try {
			EpDanePodmiotu result = (EpDanePodmiotu) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EpDanePodmiotu findById(long id) {
		log.debug("getting EpDanePodmiotu instance with id: " + id);
		try {
			EpDanePodmiotu instance = (EpDanePodmiotu) getHibernateTemplate().get("EpDanePodmiotu", id);
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

	public EpDanePodmiotu findByCode(String dapoUUID) {
		log.debug("finding EpDanePodmiotu instance by code");
		try {
			List list = getHibernateTemplate().find(
					"from EpDanePodmiotu where dapoUUID=?",
					dapoUUID);
			log.debug("find by code successful, result size: " + list.size());
			return (EpDanePodmiotu)list.get(0);
		} catch (RuntimeException re) {
			log.error("find by code failed", re);
			throw re;
		}
	}
}
