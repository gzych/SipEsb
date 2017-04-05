package com.gzych.sipesb.objects.dao;

import com.gzych.sipesb.objects.model.EpDokument;

import java.util.List;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public interface EpDokumentDao {

    public void persist(EpDokument transientInstance);

    public void delete(EpDokument persistentInstance);

    public EpDokument merge(EpDokument detachedInstance);

    public EpDokument findById(long id);

    public EpDokument findByCode(String instance);
}
