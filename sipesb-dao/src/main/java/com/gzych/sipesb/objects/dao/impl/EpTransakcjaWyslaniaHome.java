package com.gzych.sipesb.objects.dao.impl;

// default package
// Generated 2016-05-23 09:20:19 by Hibernate Tools 3.6.0

import java.util.List;
import javax.naming.InitialContext;

import com.gzych.sipesb.managers.logger.Logger;
import com.gzych.sipesb.managers.logger.LoggerFactory;
import com.gzych.sipesb.objects.dao.EpTransakcjaWyslaniaDao;
import com.gzych.sipesb.objects.model.EpTransakcjaWyslania;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Home objects for domain model class EpTransakcjaWyslania.
 * @see .EpTransakcjaWyslania
 * @author Hibernate Tools
 */
public class EpTransakcjaWyslaniaHome extends HibernateDaoSupport implements EpTransakcjaWyslaniaDao {

	private final Logger log = LoggerFactory.getLogger(getClass());

	public void persist(EpTransakcjaWyslania transientInstance) {
		log.debug("persisting EpTransakcjaWyslania instance");
		try {
			getHibernateTemplate().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void delete(EpTransakcjaWyslania persistentInstance) {
		log.debug("deleting EpTransakcjaWyslania instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EpTransakcjaWyslania merge(EpTransakcjaWyslania detachedInstance) {
		log.debug("merging EpTransakcjaWyslania instance");
		try {
			EpTransakcjaWyslania result = (EpTransakcjaWyslania) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EpTransakcjaWyslania findById(long id) {
		log.debug("getting EpTransakcjaWyslania instance with id: " + id);
		try {
			EpTransakcjaWyslania instance = (EpTransakcjaWyslania) getHibernateTemplate()
					.get("EpTransakcjaWyslania", id);
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

	public EpTransakcjaWyslania findByCode(String trwyUUID) {
		log.debug("finding EpTransakcjaWyslania instance by code");
		try {
			List list = getHibernateTemplate().find(
					"from EpMetadaneDokumentu where trwyUUID=?",
					trwyUUID);
			log.debug("find by code successful, result size: " + list.size());
			return (EpTransakcjaWyslania)list.get(0);
		} catch (RuntimeException re) {
			log.error("find by code failed", re);
			throw re;
		}
	}
}
