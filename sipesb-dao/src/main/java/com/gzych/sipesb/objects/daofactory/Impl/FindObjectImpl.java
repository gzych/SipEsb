package com.gzych.sipesb.objects.daofactory.Impl;

import com.gzych.sipesb.managers.logger.Logger;
import com.gzych.sipesb.managers.logger.LoggerFactory;
import com.gzych.sipesb.objects.applicationcontext.ApplicationContextProvider;
import com.gzych.sipesb.objects.bo.EpTransakcjaOdbioruBo;
import com.gzych.sipesb.objects.daofactory.FindObject;
import com.gzych.sipesb.objects.model.EpTransakcjaOdbioru;
import com.gzych.sipesb.objects.model.EpTransakcjaWyslania;

/**
 * Created by Grzegorz Zych on 2016-06-27.
 */
public class FindObjectImpl implements FindObject{

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private ApplicationContextProvider appContextProvider;

    public FindObjectImpl(){
        setAppContext();
    }
    // Setters
    private void setAppContext(){
        logger.in();
        ApplicationContextProvider appContextProvider = new ApplicationContextProvider();
        this.appContextProvider = appContextProvider;
        logger.out();
    }
    //Getters
    private ApplicationContextProvider getAppContextProvider(){
        return this.appContextProvider;
    }

    public void findObjectByEpTransakcjaWyslania(EpTransakcjaWyslania epTransakcjaWyslania){
        logger.in(epTransakcjaWyslania);
        //Gettings beans
        logger.info("Beans Getters");
        EpTransakcjaOdbioruBo epTransakcjaOdbioruBo = appContextProvider.getEpTransakcjaOdbioruBo();
        epTransakcjaOdbioruBo.findByCode("");
    }

    public void findObjectByEpTransakcjaOdbioru (EpTransakcjaOdbioru epTransakcjaOdbioru){
        logger.in(epTransakcjaOdbioru);
        //Gettings beans
        logger.info("Beans Getters");
    }
}
