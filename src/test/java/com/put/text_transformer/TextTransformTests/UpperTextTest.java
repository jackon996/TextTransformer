package com.put.text_transformer.TextTransformTests;

import com.put.text_transformer.TextTransform.LowerText;
import com.put.text_transformer.TextTransform.TextInput;
import com.put.text_transformer.TextTransform.UpperText;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpperTextTest {

    @Test
    public void upper() throws Exception{
        assertEquals("WITAM", new UpperText(new TextInput("witam")).transform());
        assertEquals("WITAM", new UpperText(new TextInput("wITAM")).transform());
        assertEquals("WITAM", new UpperText(new TextInput("WITAm")).transform());
        assertEquals("WITAM", new UpperText(new TextInput("WitaM")).transform());
        assertEquals("WITAM, CO SLYCHAC", new UpperText(new TextInput("wiTam, co Slychac")).transform());
        assertEquals("", new UpperText(new TextInput("")).transform());
    }
}
