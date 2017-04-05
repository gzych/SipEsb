package com.gzych.sipesb.objects.bo.impl;

import com.gzych.sipesb.objects.bo.EpDanePodmiotuBo;
import com.gzych.sipesb.objects.dao.EpDanePodmiotuDao;
import com.gzych.sipesb.objects.model.EpDanePodmiotu;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public class EpDanePodmiotuBoImpl implements EpDanePodmiotuBo{

    EpDanePodmiotuDao epDanePodmiotuDao;

    public void persist(EpDanePodmiotu transientInstance){
        epDanePodmiotuDao.persist(transientInstance);
    }

    public void delete(EpDanePodmiotu persistentInstance){ epDanePodmiotuDao.delete(persistentInstance); }

    public EpDanePodmiotu merge(EpDanePodmiotu detachedInstance){
        return epDanePodmiotuDao.merge(detachedInstance);
    }

    public EpDanePodmiotu findById(long id){ return epDanePodmiotuDao.findById(id); }

    public void setEpDanePodmiotuDao(EpDanePodmiotuDao epDanePodmiotuDao){
        this.epDanePodmiotuDao = epDanePodmiotuDao;
    }
    public EpDanePodmiotu findByCode(String dapoUUID) {
        return epDanePodmiotuDao.findByCode(dapoUUID);
    }
}
