package com.digdes.crp.javacoretasks.chapter13;

import java.awt.*;
import java.util.Currency;
import java.util.ListResourceBundle;
import java.util.Locale;

public class MyAppResources_fr extends ListResourceBundle {
    public Object[][] getContents() {
        return new Object[][] {
                { "backgroundColor", Color.BLACK },
                { "defaultPaperSize", new double[] { 210, 297 } },
                { "currency", Currency.getInstance(Locale.FRANCE) },
        };
    }
}
