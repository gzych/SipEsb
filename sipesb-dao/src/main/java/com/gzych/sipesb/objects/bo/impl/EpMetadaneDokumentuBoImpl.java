package com.gzych.sipesb.objects.bo.impl;

import com.gzych.sipesb.objects.bo.EpMetadaneDokumentuBo;
import com.gzych.sipesb.objects.dao.EpDokumentDao;
import com.gzych.sipesb.objects.dao.EpMetadaneDokumentuDao;
import com.gzych.sipesb.objects.model.EpMetadaneDokumentu;

import java.util.Set;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public class EpMetadaneDokumentuBoImpl implements EpMetadaneDokumentuBo {

    EpMetadaneDokumentuDao epMetadaneDokumentuDao;

    public void persist(EpMetadaneDokumentu transientInstance) {
        epMetadaneDokumentuDao.persist(transientInstance);
    }

    public void delete(EpMetadaneDokumentu persistentInstance) {
        epMetadaneDokumentuDao.delete(persistentInstance);
    }

    public EpMetadaneDokumentu merge(EpMetadaneDokumentu detachedInstance) {
        return epMetadaneDokumentuDao.merge(detachedInstance);
    }

    public EpMetadaneDokumentu findById(long id) {
        return epMetadaneDokumentuDao.findById(id);
    }

    public void setEpMetadaneDokumentuDao(EpMetadaneDokumentuDao epMetadaneDokumentuDao) {
        this.epMetadaneDokumentuDao = epMetadaneDokumentuDao;
    }

    public EpMetadaneDokumentu findByCode(String instance) {
        return epMetadaneDokumentuDao.findByCode(instance);
    }

    public Set<EpMetadaneDokumentu> findAll() {
        return epMetadaneDokumentuDao.findAll();
    }
}
