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
    public void simpleWords(){
        assertEquals("alo", new InverseText(new TextInput("ola")).transform());
        assertEquals("przedpokoj", new InverseText(new TextInput("jokopdezrp")).transform());

    }
    @Test
    public void sentences(){
        assertEquals("Atok am ala", new InverseText(new TextInput("Ala ma kota")).transform());
        assertEquals("Ela am Tok", new InverseText(new TextInput("Kot ma Ale")).transform());
    }
    @Test
    public void lowerUpperCases(){
        assertEquals("darnok alo", new InverseText(new TextInput("ola konrad")).transform());
        assertEquals("Darnok alO", new InverseText(new TextInput("Ola koNraD")).transform());
        assertEquals("Darnok9alO", new InverseText(new TextInput("Ola9koNraD")).transform());
    }

}
