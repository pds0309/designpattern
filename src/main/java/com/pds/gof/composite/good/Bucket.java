package com.pds.gof.composite.good;

import java.util.ArrayList;
import java.util.List;

// composite
public class Bucket implements Component {

    private List<Component> componentList = new ArrayList<>();

    public void addItem(Component component) {
        componentList.add(component);
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    @Override
    public int getPrice() {
        return componentList.stream()
                .mapToInt(Component::getPrice)
                .sum();
    }

}
