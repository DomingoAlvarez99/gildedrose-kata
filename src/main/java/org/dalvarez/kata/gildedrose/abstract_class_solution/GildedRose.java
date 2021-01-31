package org.dalvarez.kata.gildedrose.abstract_class_solution;

import java.util.Arrays;

public class GildedRose {

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items)
                .forEach(Item::updateQuality);
    }

}
