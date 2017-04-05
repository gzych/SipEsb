package com.gzych.sipesb.objects.dao;

import com.gzych.sipesb.objects.model.EpMetadaneDokumentu;

import java.util.List;
import java.util.Set;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public interface EpMetadaneDokumentuDao {

    public void persist(EpMetadaneDokumentu transientInstance);

    public void delete(EpMetadaneDokumentu persistentInstance);

    public EpMetadaneDokumentu merge(EpMetadaneDokumentu detachedInstance);

    public EpMetadaneDokumentu findById(long id);

    public EpMetadaneDokumentu findByCode(String instance);

    public Set<EpMetadaneDokumentu> findAll();
}
