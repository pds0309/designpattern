package com.pds.gof.builder;

public interface KimBabBuilder {

    KimBabBuilder base(boolean kim, boolean bab);
    KimBabBuilder normal(boolean ham, boolean danmuzi, boolean sigeumchi);
    KimBabBuilder chamchi(boolean chamchi, boolean getnip);

    KimBab build();
}
