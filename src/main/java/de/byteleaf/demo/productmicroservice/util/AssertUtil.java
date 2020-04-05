package de.byteleaf.demo.productmicroservice.util;

import org.modelmapper.internal.util.Assert;

public class AssertUtil {

    private AssertUtil() {
    }

    public static void notNull(Object object, String message) {
        Assert.notNull(object, message);
    }
}

