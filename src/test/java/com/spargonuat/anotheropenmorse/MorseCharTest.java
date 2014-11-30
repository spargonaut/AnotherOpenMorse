package com.spargonuat.anotheropenmorse;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MorseCharTest {

    @Test
    public void shouldGetUnitDurationMilliseconds() throws Exception {
        int unitDurationInMilliseconds = 200;
        int expectedDurationForDashInMilliseconds = 600;
        assertThat(MorseChar.DASH.getCharDurationMilliseconds(unitDurationInMilliseconds), is(expectedDurationForDashInMilliseconds));
    }
}