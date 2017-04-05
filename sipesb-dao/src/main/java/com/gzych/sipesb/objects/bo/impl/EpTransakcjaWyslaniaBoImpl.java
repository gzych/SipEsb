package com.gzych.sipesb.objects.bo.impl;

import com.gzych.sipesb.objects.bo.EpTransakcjaWyslaniaBo;
import com.gzych.sipesb.objects.dao.EpTransakcjaWyslaniaDao;
import com.gzych.sipesb.objects.model.EpTransakcjaWyslania;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public class EpTransakcjaWyslaniaBoImpl implements EpTransakcjaWyslaniaBo{

    EpTransakcjaWyslaniaDao epTransakcjaWyslaniaDao;

    public void persist(EpTransakcjaWyslania transientInstance){
        epTransakcjaWyslaniaDao.persist(transientInstance);
    }

    public void delete(EpTransakcjaWyslania persistentInstance){ epTransakcjaWyslaniaDao.delete(persistentInstance); }

    public EpTransakcjaWyslania merge(EpTransakcjaWyslania detachedInstance){
        return epTransakcjaWyslaniaDao.merge(detachedInstance);
    }

    public EpTransakcjaWyslania findById(long id){ return epTransakcjaWyslaniaDao.findById(id); }

    public void setEpTransakcjaWyslaniaDao(EpTransakcjaWyslaniaDao epTransakcjaWyslaniaDao){
        this.epTransakcjaWyslaniaDao = epTransakcjaWyslaniaDao;
    }

    public EpTransakcjaWyslania findByCode(String instance){return epTransakcjaWyslaniaDao.findByCode(instance);}

}
