package com.gzych.sipesb.objects.applicationcontext;

import com.gzych.sipesb.common.enums.BeansNaming;
import com.gzych.sipesb.managers.logger.Logger;
import com.gzych.sipesb.managers.logger.LoggerFactory;
import com.gzych.sipesb.objects.bo.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by Grzegorz Zych on 2016-06-26.
 */
public class ApplicationContextProvider {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    // ApplicationContext
    private ApplicationContext appContext;
    //Beans
    private EpTransakcjaWyslaniaBo epTransakcjaWyslaniaBo;
    private EpTransakcjaOdbioruBo epTransakcjaOdbioruBo;
    private EpMetadaneDokumentuBo epMetadaneDokumentuBo;
    private EpDaneNadawcyBo epDaneNadawcyBo;
    private EpDanePodmiotuBo epDanePodmiotuBo;
    private EpDokumentBo epDokumentBo;
    private EpSkrytkaAdresBo epSkrytkaAdresBo;
    private TransactionTemplate transactionTemplate;

    public ApplicationContextProvider(){
        setAppContext();
        setBeans();
    }

    private void setAppContext(){
        logger.in();
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
        this.appContext = appContext;
        logger.out();
    }

    private void setBeans(){
        logger.in();
        setEpTransakcjaWyslaniaBo(
                (EpTransakcjaWyslaniaBo)appContext.getBean(BeansNaming.epTransakcjaWyslaniaBo.toString()));
        setEpTransakcjaWyslaniaBo(
                (EpTransakcjaWyslaniaBo)appContext.getBean(BeansNaming.epTransakcjaWyslaniaBo.toString()));
        setEpTransakcjaOdbioruBo(
                (EpTransakcjaOdbioruBo)appContext.getBean(BeansNaming.epTransakcjaOdbioruBo.toString()));
        setEpMetadaneDokumentuBo(
                (EpMetadaneDokumentuBo)appContext.getBean(BeansNaming.epMetadaneDokumentuBo.toString()));
        setEpDaneNadawcyBo(
                (EpDaneNadawcyBo)appContext.getBean(BeansNaming.epDaneNadawcyBo.toString()));
        setEpDanePodmiotuBo(
                (EpDanePodmiotuBo)appContext.getBean(BeansNaming.epDanePodmiotuBo.toString()));
        setEpSkrytkaAdresBo(
                (EpSkrytkaAdresBo)appContext.getBean(BeansNaming.epSkrytkaAdresBo.toString()));
        setTransactionTemplate(
                (TransactionTemplate) appContext.getBean(BeansNaming.transactionTemplate.toString()));
        logger.out();
    }

    public EpDokumentBo getEpDokumentBo() {
        return epDokumentBo;
    }

    public void setEpDokumentBo(EpDokumentBo epDokumentBo) {
        this.epDokumentBo = epDokumentBo;
    }

    public EpTransakcjaOdbioruBo getEpTransakcjaOdbioruBo() {
        return epTransakcjaOdbioruBo;
    }

    public void setEpTransakcjaOdbioruBo(EpTransakcjaOdbioruBo epTransakcjaOdbioruBo) {
        this.epTransakcjaOdbioruBo = epTransakcjaOdbioruBo;
    }

    public EpMetadaneDokumentuBo getEpMetadaneDokumentuBo() {
        return epMetadaneDokumentuBo;
    }

    public void setEpMetadaneDokumentuBo(EpMetadaneDokumentuBo epMetadaneDokumentuBo) {
        this.epMetadaneDokumentuBo = epMetadaneDokumentuBo;
    }

    public EpDaneNadawcyBo getEpDaneNadawcyBo() {
        return epDaneNadawcyBo;
    }

    private void setEpDaneNadawcyBo(EpDaneNadawcyBo epDaneNadawcyBo) {
        this.epDaneNadawcyBo = epDaneNadawcyBo;
    }

    public EpDanePodmiotuBo getEpDanePodmiotuBo() {
        return epDanePodmiotuBo;
    }

    private void setEpDanePodmiotuBo(EpDanePodmiotuBo epDanePodmiotuBo) {
        this.epDanePodmiotuBo = epDanePodmiotuBo;
    }

    public EpSkrytkaAdresBo getEpSkrytkaAdresBo() {
        return epSkrytkaAdresBo;
    }

    private void setEpSkrytkaAdresBo(EpSkrytkaAdresBo epSkrytkaAdresBo) {
        this.epSkrytkaAdresBo = epSkrytkaAdresBo;
    }

    public EpTransakcjaWyslaniaBo getEpTransakcjaWyslaniaBo() {
        return epTransakcjaWyslaniaBo;
    }

    private void setEpTransakcjaWyslaniaBo(EpTransakcjaWyslaniaBo epTransakcjaWyslaniaBo) {
        this.epTransakcjaWyslaniaBo = epTransakcjaWyslaniaBo;
    }

    public TransactionTemplate getTransactionTemplate(){ return transactionTemplate; }

    private void setTransactionTemplate(TransactionTemplate transactionTemplate){
        this.transactionTemplate = transactionTemplate;
    }

    public void close(){
        ((ConfigurableApplicationContext)appContext).close();
    }

}
