package com.put.text_transformer.TextTransformTests;

import com.put.text_transformer.TextTransform.LowerText;
import com.put.text_transformer.TextTransform.TextInput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Master Faster on 03.01.2018.
 */
public class LowerTextTest {

    @Test
    public void lower() throws Exception{
        assertEquals("witam", new LowerText(new TextInput("WITAM")).transform());
        assertEquals("witam", new LowerText(new TextInput("Witam")).transform());
        assertEquals("witam", new LowerText(new TextInput("witaM")).transform());
        assertEquals("witam", new LowerText(new TextInput("wITAm")).transform());
        assertEquals("witam co slychac", new LowerText(new TextInput("Witam Co Slychac")).transform());
        assertEquals("witam co slychac", new LowerText(new TextInput("WITAM CO SLYCHAC")).transform());
        assertEquals("", new LowerText(new TextInput("")).transform());
    }
}
