package com.gzych.sipesb.objects.dao;

import com.gzych.sipesb.objects.model.EpSkrytkaAdres;

import java.util.List;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public interface EpSkrytkaAdresDao {

    public void persist(EpSkrytkaAdres transientInstance);

    public void delete(EpSkrytkaAdres persistentInstance);

    public EpSkrytkaAdres merge(EpSkrytkaAdres detachedInstance);

    public EpSkrytkaAdres findById(long id);

    public EpSkrytkaAdres findByCode(String instance);
}
