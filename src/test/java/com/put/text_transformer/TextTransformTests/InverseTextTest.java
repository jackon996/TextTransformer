package com.put.text_transformer.TextTransformTests;

import com.put.text_transformer.TextTransform.InverseText;
import com.put.text_transformer.TextTransform.TextInput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Master Faster on 03.01.2018.
 */
public class InverseTextTest {

    @Test
    public void inverse(){
        assertEquals("alo", new InverseText(new TextInput("ola")).transform());
        assertEquals("darnok alo", new InverseText(new TextInput("ola konrad")).transform());
        assertEquals("Darnok alO", new InverseText(new TextInput("Ola koNraD")).transform());
        assertEquals("Darnok9alO", new InverseText(new TextInput("Ola9koNraD")).transform());
    }
}
