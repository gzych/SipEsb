package com.gzych.sipesb.objects.dao;

import com.gzych.sipesb.objects.model.EpTransakcjaWyslania;

import java.util.List;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public interface EpTransakcjaWyslaniaDao {

    public void persist(EpTransakcjaWyslania transientInstance);

    public void delete(EpTransakcjaWyslania persistentInstance);

    public EpTransakcjaWyslania merge(EpTransakcjaWyslania detachedInstance);

    public EpTransakcjaWyslania findById(long id);

    public EpTransakcjaWyslania findByCode(String instance);
}
