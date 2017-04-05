package com.gzych.sipesb.objects.bo.impl;

import com.gzych.sipesb.objects.bo.EpSkrytkaAdresBo;
import com.gzych.sipesb.objects.dao.EpSkrytkaAdresDao;
import com.gzych.sipesb.objects.model.EpSkrytkaAdres;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public class EpSkrytkaAdresBoImpl implements EpSkrytkaAdresBo{

    EpSkrytkaAdresDao epSkrytkaAdresDao;

    public void persist(EpSkrytkaAdres transientInstance){
        epSkrytkaAdresDao.persist(transientInstance);
    }

    public void delete(EpSkrytkaAdres persistentInstance){ epSkrytkaAdresDao.delete(persistentInstance); }

    public EpSkrytkaAdres merge(EpSkrytkaAdres detachedInstance){
        return epSkrytkaAdresDao.merge(detachedInstance);
    }

    public EpSkrytkaAdres findById(long id){ return epSkrytkaAdresDao.findById(id); }

    public void setEpSkrytkaAdresDao(EpSkrytkaAdresDao epSkrytkaAdresDao){
        this.epSkrytkaAdresDao = epSkrytkaAdresDao;
    }

    public EpSkrytkaAdres findByCode(String instance){return epSkrytkaAdresDao.findByCode(instance);}

}
