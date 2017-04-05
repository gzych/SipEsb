package com.gzych.sipesb.objects.daofactory.Impl;

import com.gzych.sipesb.managers.logger.Logger;
import com.gzych.sipesb.managers.logger.LoggerFactory;
import com.gzych.sipesb.objects.applicationcontext.ApplicationContextProvider;
import com.gzych.sipesb.objects.bo.*;
import com.gzych.sipesb.objects.model.*;
import com.gzych.sipesb.objects.daofactory.PersistObject;

/**
 * Users Cascade Implementation
 * Created by Grzegorz Zych on 2016-06-14.
 */
public class PersistObjectImpl implements PersistObject {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private ApplicationContextProvider appContextProvider;

    public PersistObjectImpl(){
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

    public void persistObjectByEpTransakcjaOdbioru(EpTransakcjaOdbioru epTransakcjaOdbioru){
        logger.in(epTransakcjaOdbioru);
        //Gettings beans
        logger.info("Beans Getters");
        EpTransakcjaOdbioruBo epTransakcjaOdbioruBo = appContextProvider.getEpTransakcjaOdbioruBo();
        EpMetadaneDokumentuBo epMetadaneDokumentuBo = appContextProvider.getEpMetadaneDokumentuBo();
        EpDaneNadawcyBo epDaneNadawcyBo = appContextProvider.getEpDaneNadawcyBo();
        EpDanePodmiotuBo epDanePodmiotuBo = appContextProvider.getEpDanePodmiotuBo();
        EpSkrytkaAdresBo epSkrytkaAdresBo = appContextProvider.getEpSkrytkaAdresBo();
        EpDokumentBo epDokumentBo = appContextProvider.getEpDokumentBo();

        //Persist beans logic
        logger.info("Persist beans logic");
        epTransakcjaOdbioruBo.persist(epTransakcjaOdbioru);
        for(EpMetadaneDokumentu epMetadaneDokumentu : epTransakcjaOdbioru.getEpMetadaneDokumentus()){
            epMetadaneDokumentuBo.persist(epMetadaneDokumentu);
            for(EpDaneNadawcy epDaneNadawcy: epMetadaneDokumentu.getEpDaneNadawcies()){
                epDaneNadawcyBo.persist(epDaneNadawcy);
            }
            for(EpDanePodmiotu epDanePodmiotu: epMetadaneDokumentu.getEpDanePodmiotus()){
                epDanePodmiotuBo.persist(epDanePodmiotu);
            }
            for(EpSkrytkaAdres epSkrytkaAdres: epMetadaneDokumentu.getEpSkrytkaAdreses()){
                epSkrytkaAdresBo.persist(epSkrytkaAdres);
            }
            for(EpDokument epDokument: epMetadaneDokumentu.getEpDokuments()){
                epDokumentBo.persist(epDokument);
            }
        }
        logger.out();
    }

    public void persistObjectByEpTransakcjaWyslania(EpTransakcjaWyslania epTransakcjaWyslania){
        logger.in(epTransakcjaWyslania);
        EpTransakcjaWyslaniaBo epTransakcjaWyslaniaBo = appContextProvider.getEpTransakcjaWyslaniaBo();
        EpMetadaneDokumentuBo epMetadaneDokumentuBo = appContextProvider.getEpMetadaneDokumentuBo();
        EpDaneNadawcyBo epDaneNadawcyBo = appContextProvider.getEpDaneNadawcyBo();
        EpDanePodmiotuBo epDanePodmiotuBo = appContextProvider.getEpDanePodmiotuBo();
        EpSkrytkaAdresBo epSkrytkaAdresBo = appContextProvider.getEpSkrytkaAdresBo();
        EpDokumentBo epDokumentBo = appContextProvider.getEpDokumentBo();

        //Persist beans logic
        logger.info("Persist beans logic");
        epTransakcjaWyslaniaBo.persist(epTransakcjaWyslania);
        for(EpMetadaneDokumentu epMetadaneDokumentu : epTransakcjaWyslania.getEpMetadaneDokumentus()){
            epMetadaneDokumentuBo.persist(epMetadaneDokumentu);
            for(EpDaneNadawcy epDaneNadawcy: epMetadaneDokumentu.getEpDaneNadawcies()){
                epDaneNadawcyBo.persist(epDaneNadawcy);
            }
            for(EpDanePodmiotu epDanePodmiotu: epMetadaneDokumentu.getEpDanePodmiotus()){
                epDanePodmiotuBo.persist(epDanePodmiotu);
            }
            for(EpSkrytkaAdres epSkrytkaAdres: epMetadaneDokumentu.getEpSkrytkaAdreses()){
                epSkrytkaAdresBo.persist(epSkrytkaAdres);
            }
            for(EpDokument epDokument: epMetadaneDokumentu.getEpDokuments()){
                epDokumentBo.persist(epDokument);
            }
        }
        logger.out();
    }
}
