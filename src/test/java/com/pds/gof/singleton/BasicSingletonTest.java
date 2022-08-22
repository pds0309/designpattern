package com.pds.gof.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.assertj.core.api.Assertions.assertThat;

class BasicSingletonTest {

    @Test
    @DisplayName("단순하게 최초 조회 때 인스턴스화 해주는 싱글톤 객체는 thread-safe 하지 않다.")
    void basicSingletonMayBeNotThreadSafe() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        CountDownLatch latch = new CountDownLatch(20);
        Set<BasicSingleton> basicSingletonList = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            service.submit(() -> {
                basicSingletonList.add(BasicSingleton.getInstance());
                latch.countDown();
            });
        }
        latch.await();
        assertThat(basicSingletonList.stream().filter(Objects::nonNull))
                .hasSizeGreaterThan(0);
    }
}
