package com.drandard.changes;

import org.junit.jupiter.api.*;

/**
 * Created by drandard on 21.07.2016.
 */
public class JUnit5_GeneralChanges {

    /**
     * Tests are only not allowed to be static / private. Same goes for @Before.../@After...
     *
     * timeout=? and expected=? parameters have now moved elsewhere.
     */
    @Test
    void test() {}

}
