package com.razor.photo.organizer.console;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: phemmings
 * Date: 7/15/13
 * Time: 3:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConsumerTest {

    private ProductionLine productionLine = new ProductionLine();

    @Test
    public void setConsumerFlagTrueSuccessfully() {
        Consumer c = new Consumer(this.productionLine);
        c.startConsuming();
        assertFalse(c.consumptionComplete());
    }

    @Test
    public void setConsumerFlagFalseSuccessfully() {
        Consumer consumer = new Consumer(this.productionLine);
        consumer.stopConsuming();
        assertTrue(consumer.consumptionComplete());
    }
}
