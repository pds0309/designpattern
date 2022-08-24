package com.pds.gof.factorymethod.good;

public class HotTacoMaker implements TacoTruck {

    // 매운맛 타코를 추가(확장)하더라도 기존의 타코만드는 프로세스 부분의 코드를 변경하지 않아도 된다.
    // == 기존 타코 생성 관련 애들은 얘가 추가되어도 동작을 신경 쓸 필요 없다.
    @Override
    public GoodTaco createTaco() {
        return new GoodTaco("매운맛", "SpicySource", 1700);
    }
}
