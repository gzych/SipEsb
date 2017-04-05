package com.gzych.sipesb.objects.daofactory;

import com.gzych.sipesb.objects.model.EpTransakcjaOdbioru;
import com.gzych.sipesb.objects.model.EpTransakcjaWyslania;

/**
 * Created by Grzegorz Zych on 2016-06-27.
 */
public interface FindObject {

    public void findObjectByEpTransakcjaWyslania(EpTransakcjaWyslania epTransakcjaWyslania);

    public void findObjectByEpTransakcjaOdbioru (EpTransakcjaOdbioru epTransakcjaOdbioru);
}
