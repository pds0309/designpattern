package com.pds.gof.builder;

public class DefaultKimBabBuilder implements KimBabBuilder {

    private boolean kim;
    private boolean bab;
    private boolean ham;
    private boolean danmuzi;
    private boolean sigeumchi;
    private boolean chamchi;
    private boolean getnip;

    @Override
    public KimBabBuilder base(boolean kim, boolean bab) {
        this.kim = kim;
        this.bab = bab;
        return this;
    }

    @Override
    public KimBabBuilder normal(boolean ham, boolean danmuzi, boolean sigeumchi) {
        this.ham = ham;
        this.danmuzi = danmuzi;
        this.sigeumchi = sigeumchi;
        return this;
    }

    @Override
    public KimBabBuilder chamchi(boolean chamchi, boolean getnip) {
        this.chamchi = chamchi;
        this.getnip = getnip;
        return this;
    }

    @Override
    public KimBab build() {
        return new KimBab(kim, bab, ham, danmuzi, sigeumchi, chamchi, getnip);
    }

}
