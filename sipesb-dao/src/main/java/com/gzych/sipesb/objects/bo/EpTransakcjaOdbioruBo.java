package com.gzych.sipesb.objects.bo;

import com.gzych.sipesb.objects.model.EpTransakcjaOdbioru;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public interface EpTransakcjaOdbioruBo {

    public void persist(EpTransakcjaOdbioru transientInstance);

    public void delete(EpTransakcjaOdbioru persistentInstance);

    public EpTransakcjaOdbioru merge(EpTransakcjaOdbioru detachedInstance);

    public EpTransakcjaOdbioru findById(long id);

    public EpTransakcjaOdbioru findByCode(String instance);

}
