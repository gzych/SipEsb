package com.gzych.sipesb.objects.bo;

import com.gzych.sipesb.objects.model.EpDaneNadawcy;

import java.util.List;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public interface EpDaneNadawcyBo {

    public void persist(EpDaneNadawcy transientInstance);

    public void delete(EpDaneNadawcy persistentInstance);

    public EpDaneNadawcy merge(EpDaneNadawcy detachedInstance);

    public EpDaneNadawcy findById(long id);

    public EpDaneNadawcy findByCode(String instance);

}
