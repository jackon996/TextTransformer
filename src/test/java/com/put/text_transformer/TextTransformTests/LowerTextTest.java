package com.put.text_transformer.TextTransformTests;

import com.put.text_transformer.TextTransform.IText;
import com.put.text_transformer.TextTransform.InverseText;
import com.put.text_transformer.TextTransform.LowerText;
import com.put.text_transformer.TextTransform.TextInput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
        assertEquals("", new LowerText(new TextInput("")).transform());
    }

    @Test
    public void lowerMock() throws Exception{
        IText mockObject = mock(IText.class);
        when(mockObject.transform()).thenReturn("Witam Co Slychac");
        LowerText testedObject = new LowerText(mockObject);
        String result = testedObject.transform();
        verify(mockObject).transform();
        assertEquals("witam co slychac", result);
    }
}
