package com.gzych.sipesb.objects.bo.impl;

import com.gzych.sipesb.objects.bo.EpDokumentBo;
import com.gzych.sipesb.objects.dao.EpDokumentDao;
import com.gzych.sipesb.objects.model.EpDaneNadawcy;
import com.gzych.sipesb.objects.model.EpDokument;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public class EpDokumentBoImpl implements EpDokumentBo{

    EpDokumentDao epDokumentDao;

    public void persist(EpDokument transientInstance){
        epDokumentDao.persist(transientInstance);
    }

    public void delete(EpDokument persistentInstance){ epDokumentDao.delete(persistentInstance); }

    public EpDokument merge(EpDokument detachedInstance){
        return epDokumentDao.merge(detachedInstance);
    }

    public EpDokument findById(long id){ return epDokumentDao.findById(id); }

    public void setEpDokumentDao(EpDokumentDao epDokumentDao){
        this.epDokumentDao = epDokumentDao;
    }

    public EpDokument findByCode(String instance){return epDokumentDao.findByCode(instance);}

}
