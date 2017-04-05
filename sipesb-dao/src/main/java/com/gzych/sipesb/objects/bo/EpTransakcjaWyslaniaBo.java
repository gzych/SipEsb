package com.gzych.sipesb.objects.bo;

import com.gzych.sipesb.objects.model.EpTransakcjaWyslania;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public interface EpTransakcjaWyslaniaBo {

    public void persist(EpTransakcjaWyslania transientInstance);

    public void delete(EpTransakcjaWyslania persistentInstance);

    public EpTransakcjaWyslania merge(EpTransakcjaWyslania detachedInstance);

    public EpTransakcjaWyslania findById(long id);

    public EpTransakcjaWyslania findByCode(String instance);

}
