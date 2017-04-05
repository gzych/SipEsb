package com.gzych.sipesb.objects.bo;

import com.gzych.sipesb.objects.model.EpDanePodmiotu;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public interface EpDanePodmiotuBo {

    public void persist(EpDanePodmiotu transientInstance);

    public void delete(EpDanePodmiotu persistentInstance);

    public EpDanePodmiotu merge(EpDanePodmiotu detachedInstance);

    public EpDanePodmiotu findById(long id);

    public EpDanePodmiotu findByCode(String instance);
}
