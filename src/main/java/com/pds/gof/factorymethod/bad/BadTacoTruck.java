package com.pds.gof.factorymethod.bad;

public class BadTacoTruck {

    private BadTacoTruck() {
    }

    public static BadTaco orderTaco(String type) {
        validTypeName(type);
        BadTaco badTaco = new BadTaco();
        if ("보통맛".equals(type)) {
            badTaco.setContents("Octopus's Leg");
            badTaco.setPrice(1500);
        } else if ("치즈맛".equals(type)) {
            badTaco.setContents("Cheese Cream");
            badTaco.setPrice(1800);
        } else {
            throw new IllegalArgumentException("존재하지 않는 종류임");
        }
        // 매운맛을 객체를 추가하려면 이 부분에 무언가 추가가 되어야 한다.
        badTaco.setName(type + " 타코야키");

        printResult(badTaco.getName(), badTaco.getPrice());
        return badTaco;
    }

    private static void printResult(String name, int price) {
        System.out.println(name + "은 " + price + "원입니다.");
    }

    private static void validTypeName(String type) {
        if (type.isBlank()) {
            throw new IllegalArgumentException("종류를 요구하지 않음");
        }
    }
}
