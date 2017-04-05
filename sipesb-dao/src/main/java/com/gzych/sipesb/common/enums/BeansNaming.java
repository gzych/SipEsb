package com.gzych.sipesb.common.enums;

/**
 * Created by Grzegorz Zych on 2016-06-27.
 */
public enum BeansNaming {
    epDaneNadawcyBo("epDaneNadawcyBo"),
    epDanePodmiotuBo("epDanePodmiotuBo"),
    epDokumentBo("epDokumentBo"),
    epMetadaneDokumentuBo("epMetadaneDokumentuBo"),
    epSkrytkaAdresBo("epSkrytkaAdresBo"),
    epTransakcjaOdbioruBo("epTransakcjaOdbioruBo"),
    epTransakcjaWyslaniaBo("epTransakcjaWyslaniaBo"),
    transactionTemplate("transactionTemplate");

    private final String name;
    private BeansNaming(String name) {
        this.name = name;
    }
    public boolean equalsName(String name) {
        return (name == null) ? false : this.name.equals(name);
    }
    public String toString() {
        return this.name;
    }
}
