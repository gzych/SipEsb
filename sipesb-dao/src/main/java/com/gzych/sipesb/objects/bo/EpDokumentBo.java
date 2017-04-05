package com.gzych.sipesb.objects.bo;

import com.gzych.sipesb.objects.model.EpDokument;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public interface EpDokumentBo {

    public void persist(EpDokument transientInstance);

    public void delete(EpDokument persistentInstance);

    public EpDokument merge(EpDokument detachedInstance);

    public EpDokument findById(long id);

    public EpDokument findByCode(String instance);

}
