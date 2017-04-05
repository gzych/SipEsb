package com.gzych.sipesb.objects.dao.impl;

// default package
// Generated 2016-05-23 09:20:19 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.naming.InitialContext;

import com.gzych.sipesb.managers.logger.Logger;
import com.gzych.sipesb.managers.logger.LoggerFactory;
import com.gzych.sipesb.objects.dao.EpMetadaneDokumentuDao;
import com.gzych.sipesb.objects.model.EpMetadaneDokumentu;
import org.hibernate.*;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Home objects for domain model class EpMetadaneDokumentu.
 * @see .EpMetadaneDokumentu
 * @author Hibernate Tools
 */
public class EpMetadaneDokumentuHome extends HibernateDaoSupport implements EpMetadaneDokumentuDao {

	private final Logger log = LoggerFactory.getLogger(getClass());

	public void persist(EpMetadaneDokumentu transientInstance) {
		log.debug("persisting EpMetadaneDokumentu instance");
		try {
			getHibernateTemplate().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void delete(EpMetadaneDokumentu persistentInstance) {
		log.debug("deleting EpMetadaneDokumentu instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EpMetadaneDokumentu merge(EpMetadaneDokumentu detachedInstance) {
		log.debug("merging EpMetadaneDokumentu instance");
		try {
			EpMetadaneDokumentu result = (EpMetadaneDokumentu) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EpMetadaneDokumentu findById(long id) {
		log.debug("getting EpMetadaneDokumentu instance with id: " + id);
		try {
			EpMetadaneDokumentu instance = (EpMetadaneDokumentu) getHibernateTemplate()
					.get(com.gzych.sipesb.objects.model.EpMetadaneDokumentu.class, id);
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

	public EpMetadaneDokumentu findByCode(String medoUUID) {
		log.debug("finding EpMetadaneDokumentu instance by code");
		try {
			List list = getHibernateTemplate().find(
					"from EpMetadaneDokumentu where medoUUID=?",
					medoUUID);
			log.debug("find by code successful, result size: " + list.size());
			return (EpMetadaneDokumentu)list.get(0);
		} catch (RuntimeException re) {
			log.error("find by code failed", re);
			throw re;
		}
	}

	public Set<EpMetadaneDokumentu> findAll() {
		log.debug("getting all EpMetadaneDokumentu instance ");
		try {
			List list = getHibernateTemplate().find("from EpMetadaneDokumentu " +
					"LEFT JOIN FETCH EpMetadaneDokumentu.EpDanePodmiotus " +
					"LEFT JOIN FETCH EpMetadaneDokumentu.EpDokuments " +
					"LEFT JOIN FETCH EpMetadaneDokumentu.EpSkrytkaAdreses " +
					"LEFT JOIN FETCH EpMetadaneDokumentu.EpDaneNadawcies ");
			log.info(list);
			log.debug("find all successful, result size: " + list.size());
			Set<EpMetadaneDokumentu>listSet = new HashSet<EpMetadaneDokumentu>(list);
			return listSet;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
