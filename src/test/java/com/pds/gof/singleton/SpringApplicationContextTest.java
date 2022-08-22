package com.pds.gof.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

class SpringApplicationContextTest {

    ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(SpringSampleConfig.class);

    @Test
    void applicationContextBeanShouldInitOnce() {
        StringBuilder sb1 = applicationContext.getBean("getStringBuilder", StringBuilder.class);
        StringBuilder sb2 = applicationContext.getBean("getStringBuilder", StringBuilder.class);
        assertThat(sb1)
                .isEqualTo(sb2)
                .isNotEqualTo(new StringBuilder());
    }
}
