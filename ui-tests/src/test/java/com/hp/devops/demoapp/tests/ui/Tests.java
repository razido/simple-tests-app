 package com.hp.devops.demoapp.tests.ui;
 /**
 * Created by adrachuk on 22.11.2016.
 */
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class Tests {
    @Test
    public void testPassed(){
        assertEquals(false,false);
    }

    @Test
    public void testFailed(){
        assertEquals(true,false);
    }
}
