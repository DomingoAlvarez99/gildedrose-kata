package org.dalvarez.kata.gildedrose.abstract_class_solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseShould {

    private Item[] arrayWith(Item item) {
        return new Item[]{
                item
        };
    }

    @Test
    public void testThatSellInValueIsDecreased() {
        Item whateverItem = new DefaultItem("whatever", 10, 0);

        GildedRose gildedRose = new GildedRose(arrayWith(whateverItem));
        gildedRose.updateQuality();

        assertEquals(whateverItem.getSellIn(), 9);
    }

    @Test
    public void testThatQualityValueIsDecreased() {
        Item whateverItem = new DefaultItem("whatever", 1, 10);

        GildedRose gildedRose = new GildedRose(arrayWith(whateverItem));
        gildedRose.updateQuality();

        assertEquals(whateverItem.getQuality(), 9);
    }

    @Test
    public void testThatQualityDecreasesTwiceAsMuchWhenSellByIsPassed() {
        Item whateverItem = new DefaultItem("whatever", 0, 10);

        GildedRose gildedRose = new GildedRose(arrayWith(whateverItem));
        gildedRose.updateQuality();

        assertEquals(whateverItem.getQuality(), 8);
    }

    @Test
    public void testThatQualityIsNeverNegative() {
        Item whateverItem = new DefaultItem("whatever", 0, 0);

        GildedRose gildedRose = new GildedRose(arrayWith(whateverItem));
        gildedRose.updateQuality();

        assertEquals(whateverItem.getQuality(), 0);
    }

    @Test
    public void testAgedBrieIncreasesQualityWithAge() {
        Item agedBrie = new AgedBrieItem("Aged Brie", 5, 1);

        GildedRose gildedRose = new GildedRose(arrayWith(agedBrie));
        gildedRose.updateQuality();

        assertEquals(agedBrie.getQuality(), 2);
    }

    @Test
    public void testQualityNeverIncreasesPastFifty() {
        Item agedBrie = new AgedBrieItem("Aged Brie", 5, 50);

        GildedRose gildedRose = new GildedRose(arrayWith(agedBrie));
        gildedRose.updateQuality();

        assertEquals(agedBrie.getQuality(), 50);
    }

    @Test
    public void testSulfurasNeverChanges() {
        Item sulfuras = new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 25);

        GildedRose gildedRose = new GildedRose(arrayWith(sulfuras));
        gildedRose.updateQuality();

        assertEquals(sulfuras.getQuality(), 25);
        assertEquals(sulfuras.getSellIn(), 0);
    }

    @Test
    public void testBackstagePassIncreasesQualityByOneIfSellByGreaterThenTen() {
        Item backstagePasses = new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 11, 20);

        GildedRose gildedRose = new GildedRose(arrayWith(backstagePasses));
        gildedRose.updateQuality();

        assertEquals(backstagePasses.getQuality(), 21);
    }

    @Test
    public void testBackstagePassIncreasesQualityByTwoIfSellBySmallerThanTen() {
        Item backstagePasses = new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 6, 20);

        GildedRose gildedRose = new GildedRose(arrayWith(backstagePasses));
        gildedRose.updateQuality();

        assertEquals(backstagePasses.getQuality(), 22);
    }

    @Test
    public void testBackstagePassIncreasesQualityByThreeIfSellBySmallerThanFive() {
        Item backstagePasses = new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 5, 20);

        GildedRose gildedRose = new GildedRose(arrayWith(backstagePasses));
        gildedRose.updateQuality();

        assertEquals(backstagePasses.getQuality(), 23);
    }

    @Test
    public void testBackstagePassLosesValueAfterSellByPasses() {
        Item backstagePasses = new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 0, 20);

        GildedRose gildedRose = new GildedRose(arrayWith(backstagePasses));
        gildedRose.updateQuality();

        assertEquals(backstagePasses.getQuality(), 0);
    }

}
