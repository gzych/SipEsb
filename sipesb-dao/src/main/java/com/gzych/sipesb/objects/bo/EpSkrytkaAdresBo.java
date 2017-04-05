package com.gzych.sipesb.objects.bo;

import com.gzych.sipesb.objects.model.EpSkrytkaAdres;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public interface EpSkrytkaAdresBo {

    public void persist(EpSkrytkaAdres transientInstance);

    public void delete(EpSkrytkaAdres persistentInstance);

    public EpSkrytkaAdres merge(EpSkrytkaAdres detachedInstance);

    public EpSkrytkaAdres findById(long id);

    public EpSkrytkaAdres findByCode(String instance);

}
