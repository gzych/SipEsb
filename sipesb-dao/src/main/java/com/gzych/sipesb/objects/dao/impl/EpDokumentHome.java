package com.gzych.sipesb.objects.dao.impl;

// default package
// Generated 2016-05-23 09:20:19 by Hibernate Tools 3.6.0

import java.util.List;
import javax.naming.InitialContext;

import com.gzych.sipesb.managers.logger.Logger;
import com.gzych.sipesb.managers.logger.LoggerFactory;
import com.gzych.sipesb.objects.dao.EpDokumentDao;
import com.gzych.sipesb.objects.model.EpDokument;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Home objects for domain model class EpDokument.
 * @see .EpDokument
 * @author Hibernate Tools
 */
public class EpDokumentHome extends HibernateDaoSupport implements EpDokumentDao{

	private final Logger log = LoggerFactory.getLogger(getClass());

	public void persist(EpDokument transientInstance) {
		log.debug("persisting EpDokument instance");
		try {
			getHibernateTemplate().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void delete(EpDokument persistentInstance) {
		log.debug("deleting EpDokument instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EpDokument merge(EpDokument detachedInstance) {
		log.debug("merging EpDokument instance");
		try {
			EpDokument result = (EpDokument) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EpDokument findById(long id) {
		log.debug("getting EpDokument instance with id: " + id);
		try {
			EpDokument instance = (EpDokument) getHibernateTemplate().get("EpDokument", id);
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

	public EpDokument findByCode(String code) {
		log.debug("finding EpDokument instance by code");
		try {
			List list = getHibernateTemplate().find(
					"from EpDokument where code=?",
					code);
			log.debug("find by code successful, result size: " + list.size());
			return (EpDokument)list.get(0);
		} catch (RuntimeException re) {
			log.error("find by code failed", re);
			throw re;
		}
	}
}
