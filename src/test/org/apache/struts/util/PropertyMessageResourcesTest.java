package org.apache.struts.util;

import java.util.Locale;

import junit.framework.TestCase;

public class PropertyMessageResourcesTest extends TestCase {

    public void testGetMessageLocaleString() {
        String config = "org.apache.struts.webapp.example.ApplicationResources";
        MessageResourcesFactory factory = new PropertyMessageResourcesFactory();
        MessageResources messages = factory.createResources(config);
        String actual;

        actual = messages.getMessage(Locale.US, "registration.addSubscription");
        assertEquals("Add", actual);
        actual = messages.getMessage(Locale.JAPANESE, "registration.addSubscription");
        assertEquals("新規作成", actual);
        actual = messages.getMessage(new Locale("ru"), "registration.addSubscription");
        assertEquals("Добавить", actual);
    }

}
