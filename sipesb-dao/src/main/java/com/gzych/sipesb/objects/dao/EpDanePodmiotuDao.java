package com.gzych.sipesb.objects.dao;

import com.gzych.sipesb.objects.model.EpDaneNadawcy;
import com.gzych.sipesb.objects.model.EpDanePodmiotu;

import java.util.List;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public interface EpDanePodmiotuDao {

    public void persist(EpDanePodmiotu transientInstance);

    public void delete(EpDanePodmiotu persistentInstance);

    public EpDanePodmiotu merge(EpDanePodmiotu detachedInstance);

    public EpDanePodmiotu findById(long id);

    public EpDanePodmiotu findByCode(String instance);
}
