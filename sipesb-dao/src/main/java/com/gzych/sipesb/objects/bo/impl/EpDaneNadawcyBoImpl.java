package com.gzych.sipesb.objects.bo.impl;

import com.gzych.sipesb.objects.bo.EpDaneNadawcyBo;
import com.gzych.sipesb.objects.dao.EpDaneNadawcyDao;
import com.gzych.sipesb.objects.model.EpDaneNadawcy;

import java.util.List;
import java.util.Set;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public class EpDaneNadawcyBoImpl implements EpDaneNadawcyBo {

    EpDaneNadawcyDao epDaneNadawcyDao;

    public void persist(EpDaneNadawcy transientInstance){
        epDaneNadawcyDao.persist(transientInstance);
    }

    public void delete(EpDaneNadawcy persistentInstance){ epDaneNadawcyDao.delete(persistentInstance); }

    public EpDaneNadawcy merge(EpDaneNadawcy detachedInstance){
        return epDaneNadawcyDao.merge(detachedInstance);
    }

    public EpDaneNadawcy findById(long id){
        return epDaneNadawcyDao.findById(id);
    }

    public void setEpDaneNadawcyDao(EpDaneNadawcyDao epDaneNadawcyDao){
        this.epDaneNadawcyDao = epDaneNadawcyDao;
    }

    public EpDaneNadawcy findByCode(String danaUUID){return epDaneNadawcyDao.findByCode(danaUUID);}
}
