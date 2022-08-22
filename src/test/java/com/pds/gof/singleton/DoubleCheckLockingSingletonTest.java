package com.pds.gof.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

class DoubleCheckLockingSingletonTest {

    @Test
    @DisplayName("synchronized 키워드를 이용한 double checked locking 방식싱글톤 객체는 thread-safe 하다.")
    void doubleCheckedLockingSingletonShouldThreadSafe() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        CountDownLatch latch = new CountDownLatch(20);
        Set<DoubleCheckLockingSingleton> basicSingletonList = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            service.submit(() -> {
                basicSingletonList.add(DoubleCheckLockingSingleton.getInstance());
                latch.countDown();
            });
        }
        latch.await();
        assertThat(basicSingletonList.stream().filter(Objects::nonNull))
                .hasSize(1);
    }

}
