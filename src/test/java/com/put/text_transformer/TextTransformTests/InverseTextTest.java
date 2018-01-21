package com.put.text_transformer.TextTransformTests;

import com.put.text_transformer.TextTransform.IText;
import com.put.text_transformer.TextTransform.InverseText;
import com.put.text_transformer.TextTransform.TextInput;
import org.junit.Test;

import javax.xml.soap.Text;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
    public void sentenceMock(){
        IText mockObject = mock(IText.class);
        when(mockObject.transform()).thenReturn("Ala ma kota");
        InverseText testedObject = new InverseText(mockObject);
        String result = testedObject.transform();
        verify(mockObject).transform();
        assertEquals("Atok am ala", result);
    }
    @Test
    public void lowerUpperCases(){
        assertEquals("darnok alo", new InverseText(new TextInput("ola konrad")).transform());
        assertEquals("Darnok alO", new InverseText(new TextInput("Ola koNraD")).transform());
        assertEquals("Darnok9alO", new InverseText(new TextInput("Ola9koNraD")).transform());
    }

}
