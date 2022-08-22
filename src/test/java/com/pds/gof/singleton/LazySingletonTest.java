package com.pds.gof.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LazySingletonTest {

    @Test
    @DisplayName("static inner class 를 활용한 지연로딩 싱글톤 객체는 thread-safe 하다.")
    void staticInnerLazySingletonShouldThreadSafe() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        CountDownLatch latch = new CountDownLatch(5);
        Set<LazySingleton> basicSingletonList = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            service.submit(() -> {
                basicSingletonList.add(LazySingleton.getInstance());
                latch.countDown();
            });
        }
        latch.await();
        assertThat(basicSingletonList.stream().filter(Objects::nonNull))
                .hasSize(1);
    }

    @Test
    @DisplayName("리플렉션을 통해 단 하나만 생성된다는 규칙을 파괴할 수 있다.")
    void reflectionShouldInitNewSingletonInstance() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        LazySingleton instance = LazySingleton.getInstance();
        Constructor<LazySingleton> lazySingletonConstructor
                = LazySingleton.class.getDeclaredConstructor();

        // break access rule
        lazySingletonConstructor.setAccessible(true);
        LazySingleton newInstance = lazySingletonConstructor.newInstance();
        // instance == newInstance => false
        assertThat(instance).isNotEqualTo(newInstance);
    }

    @Test
    @DisplayName("직렬화-역직렬화를 통해 단 하나만 생성된다는 규칙을 파괴할 수 있다.")
    void deSerializationShouldInitNewSingletonInstance() throws IOException, ClassNotFoundException {
        LazySingleton instance = LazySingleton.getInstance();

        //se
        ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream(instance.getClass().toString()));
        out.writeObject(instance);

        //de se
        ObjectInput in = new ObjectInputStream(new FileInputStream(instance.getClass().toString()));
        LazySingleton newInstance = (LazySingleton) in.readObject();
        assertThat(instance).isNotEqualTo(newInstance);
    }

}
