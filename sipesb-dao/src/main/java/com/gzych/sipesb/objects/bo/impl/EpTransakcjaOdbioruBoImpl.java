package com.gzych.sipesb.objects.bo.impl;

import com.gzych.sipesb.objects.bo.EpTransakcjaOdbioruBo;
import com.gzych.sipesb.objects.dao.EpTransakcjaOdbioruDao;
import com.gzych.sipesb.objects.model.EpTransakcjaOdbioru;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public class EpTransakcjaOdbioruBoImpl implements EpTransakcjaOdbioruBo{

    EpTransakcjaOdbioruDao epTransakcjaOdbioruDao;

    public void persist(EpTransakcjaOdbioru transientInstance){
        epTransakcjaOdbioruDao.persist(transientInstance);
    }

    public void delete(EpTransakcjaOdbioru persistentInstance){ epTransakcjaOdbioruDao.delete(persistentInstance); }

    public EpTransakcjaOdbioru merge(EpTransakcjaOdbioru detachedInstance){
        return epTransakcjaOdbioruDao.merge(detachedInstance);
    }

    public EpTransakcjaOdbioru findById(long id){ return epTransakcjaOdbioruDao.findById(id); }

    public void setEpTransakcjaOdbioruDao(EpTransakcjaOdbioruDao epTransakcjaOdbioruDao){
        this.epTransakcjaOdbioruDao = epTransakcjaOdbioruDao;
    }

    public EpTransakcjaOdbioru findByCode(String instance){return epTransakcjaOdbioruDao.findByCode(instance);}

}
