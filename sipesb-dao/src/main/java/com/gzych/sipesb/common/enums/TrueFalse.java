package com.gzych.sipesb.common.enums;

/**
 * Created by Grzegorz Zych on 2016-06-28.
 */
public enum  TrueFalse {
    TAK("true"), NIE("false");

    private final String name;

    private TrueFalse(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
