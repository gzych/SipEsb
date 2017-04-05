package com.gzych.sipesb.objects.dao.impl;

// default package
// Generated 2016-05-23 09:20:19 by Hibernate Tools 3.6.0

import java.util.List;
import javax.naming.InitialContext;

import com.gzych.sipesb.managers.logger.Logger;
import com.gzych.sipesb.managers.logger.LoggerFactory;
import com.gzych.sipesb.objects.dao.EpTransakcjaOdbioruDao;
import com.gzych.sipesb.objects.model.EpTransakcjaOdbioru;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Home objects for domain model class EpTransakcjaOdbioru.
 * @see .EpTransakcjaOdbioru
 * @author Hibernate Tools
 */
public class EpTransakcjaOdbioruHome extends HibernateDaoSupport implements EpTransakcjaOdbioruDao {

	private final Logger log = LoggerFactory.getLogger(getClass());

	public void persist(EpTransakcjaOdbioru transientInstance) {
		log.in("persisting EpTransakcjaOdbioru instance");
		try {
			getHibernateTemplate().persist(transientInstance);
			log.out("persist successful");
		} catch (RuntimeException re) {
			log.info("persist failed", re);
			throw re;
		}
	}

	public void delete(EpTransakcjaOdbioru persistentInstance) {
		log.in("deleting EpTransakcjaOdbioru instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.out("delete successful");
		} catch (RuntimeException re) {
			log.info("delete failed", re);
			throw re;
		}
	}

	public EpTransakcjaOdbioru merge(EpTransakcjaOdbioru detachedInstance) {
		log.in("merging EpTransakcjaOdbioru instance");
		try {
			EpTransakcjaOdbioru result = (EpTransakcjaOdbioru) getHibernateTemplate()
					.merge(detachedInstance);
			log.out("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.info("merge failed", re);
			throw re;
		}
	}

	public EpTransakcjaOdbioru findById(long id) {
		log.in("getting EpTransakcjaOdbioru instance with id: " + id);
		try {
			EpTransakcjaOdbioru instance = (EpTransakcjaOdbioru) getHibernateTemplate()
					.get("EpTransakcjaOdbioru", id);
			if (instance == null) {
				log.out("get successful, no instance found");
			} else {
				log.out("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.info("get failed", re);
			throw re;
		}
	}

	public EpTransakcjaOdbioru findByCode(String trodUUID) {
		log.in("finding EpTransakcjaOdbioru instance by code");
		try {
			List list = getHibernateTemplate().find(
					"from EpMetadaneDokumentu where trodUUID=?",
					trodUUID);
			log.out("find by code successful, result size: " + list.size());
			return (EpTransakcjaOdbioru)list.get(0);
		} catch (RuntimeException re) {
			log.info("find by code failed", re);
			throw re;
		}
	}
}
