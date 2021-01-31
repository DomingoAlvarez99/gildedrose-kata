package org.dalvarez.kata.gildedrose.interface_solution;

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
