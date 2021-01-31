package org.dalvarez.kata.gildedrose.abstract_class_solution;

public abstract class Item {

    private static final int MIN_QUALITY = 0;

    private static final int DOUBLE_QUALITY_INCREASE_SELL_VALUE = 0;

    private static final int MAX_QUALITY = 50;

    private String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public abstract void updateQuality();

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void decreaseQuality() {
        if (quality > MIN_QUALITY)
            quality--;
    }

    public boolean hasToBeSoldInLessThan(int days) {
        return sellIn < days;
    }

    public void increaseQuality() {
        if (quality < MAX_QUALITY)
            quality++;
    }

    public void resetQuality() {
        quality = MIN_QUALITY;
    }

    public void decreaseSellIn() {
        sellIn--;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
