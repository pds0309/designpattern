package com.pds.gof.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class LazySerializableProtectionSingletonTest {

    @Test
    @DisplayName("역직렬화 시 인스턴스 생성하는 메소드 재정의로 직렬화-역직렬화를 통해 단 하나만 생성된다는 규칙이 파괴되지 않는다.")
    void deSerializationShouldAssureSingletonInstance() throws IOException, ClassNotFoundException {
        LazySerializableProtectionSingleton instance = LazySerializableProtectionSingleton.getInstance();

        //se
        ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream(instance.getClass().toString()));
        out.writeObject(instance);

        //de se
        ObjectInput in = new ObjectInputStream(new FileInputStream(instance.getClass().toString()));
        LazySerializableProtectionSingleton newInstance =
                (LazySerializableProtectionSingleton) in.readObject();
        assertThat(instance).isEqualTo(newInstance);
    }

}
