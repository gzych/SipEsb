package com.gzych.sipesb.objects.daofactory;

import com.gzych.sipesb.objects.model.EpTransakcjaOdbioru;
import com.gzych.sipesb.objects.model.EpTransakcjaWyslania;

/**
 * Interface of users cascade
 * Created by Grzegorz Zych on 2016-06-14.
 */
public interface PersistObject {

    public void persistObjectByEpTransakcjaWyslania (EpTransakcjaWyslania epTransakcjaWyslania);

    public void persistObjectByEpTransakcjaOdbioru (EpTransakcjaOdbioru epTransakcjaOdbioru);
}
