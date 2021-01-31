package org.dalvarez.kata.gildedrose.interface_solution;

public class AgedBrieItem extends Item {

    private static final int DOUBLE_QUALITY_INCREASE_SELL_VALUE = 0;

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        increaseQuality();

        if (hasToBeSoldInLessThan(DOUBLE_QUALITY_INCREASE_SELL_VALUE)) {
            increaseQuality();
        }
    }

}
