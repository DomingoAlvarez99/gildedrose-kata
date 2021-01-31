package org.dalvarez.kata.gildedrose.abstract_class_solution;

public class DefaultItem extends Item {

    private static final int DOUBLE_QUALITY_INCREASE_SELL_VALUE = 0;

    public DefaultItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        decreaseQuality();

        if (hasToBeSoldInLessThan(DOUBLE_QUALITY_INCREASE_SELL_VALUE)) {
            decreaseQuality();
        }
    }

}