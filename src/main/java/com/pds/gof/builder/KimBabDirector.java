package com.pds.gof.builder;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class KimBabDirector {

    private final KimBabBuilder kimBabBuilder;

    public KimBab makeNormalKimBab() {
        return kimBabBuilder
                .base(true, true)
                .normal(true, true, true)
                .build();
    }

    public KimBab makeChamChiKimBab() {
        return kimBabBuilder
                .base(true, true)
                .chamchi(true, true)
                .build();
    }
}
