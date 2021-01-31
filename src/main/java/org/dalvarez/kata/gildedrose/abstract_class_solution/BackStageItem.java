package org.dalvarez.kata.gildedrose.abstract_class_solution;

public class BackStageItem extends Item {

    private static final int QUALITY_RESET_SELL_VALUE = 0;

    private static final int DOUBLE_QUALITY_INCREASE_SELL_VALUE = 5;

    private static final int TRIPLE_QUALITY_INCREASE_SELL_VALUE = 10;

    public BackStageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        increaseQuality();

        if (hasToBeSoldInLessThan(DOUBLE_QUALITY_INCREASE_SELL_VALUE)) {
            increaseQuality();
        }

        if (hasToBeSoldInLessThan(TRIPLE_QUALITY_INCREASE_SELL_VALUE)) {
            increaseQuality();
        }

        if (hasToBeSoldInLessThan(QUALITY_RESET_SELL_VALUE)) {
            resetQuality();
        }
    }

}
