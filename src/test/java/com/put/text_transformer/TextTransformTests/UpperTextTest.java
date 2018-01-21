package com.put.text_transformer.TextTransformTests;

import com.put.text_transformer.TextTransform.IText;
import com.put.text_transformer.TextTransform.LowerText;
import com.put.text_transformer.TextTransform.TextInput;
import com.put.text_transformer.TextTransform.UpperText;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UpperTextTest {

    @Test
    public void upper() throws Exception{
        assertEquals("WITAM", new UpperText(new TextInput("witam")).transform());
        assertEquals("WITAM", new UpperText(new TextInput("wITAM")).transform());
        assertEquals("WITAM", new UpperText(new TextInput("WITAm")).transform());
        assertEquals("WITAM", new UpperText(new TextInput("WitaM")).transform());
        assertEquals("", new UpperText(new TextInput("")).transform());
    }

    @Test
    public void lowerMock() throws Exception{
        IText mockObject = mock(IText.class);
        when(mockObject.transform()).thenReturn("wiTam, co Slychac");
        UpperText testedObject = new UpperText(mockObject);
        String result = testedObject.transform();
        verify(mockObject).transform();
        assertEquals("WITAM, CO SLYCHAC", result);
    }
}
