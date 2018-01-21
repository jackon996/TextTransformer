package com.put.text_transformer.TextTransformTests;

import com.put.text_transformer.TextTransform.AbbreviatorText;
import com.put.text_transformer.TextTransform.IText;
import com.put.text_transformer.TextTransform.InverseText;
import com.put.text_transformer.TextTransform.TextInput;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by kacol on 03.01.18.
 */
public class TextAbbreviatorTest {

    @Test
    public void naPrzykladMock() throws Exception {
        IText mockObject = mock(IText.class);
        when(mockObject.transform()).thenReturn("Jurek lubi na Przykład kolegów");
        AbbreviatorText testedObject = new AbbreviatorText(mockObject);
        String result = testedObject.transform();
        verify(mockObject).transform();
        assertEquals("Jurek lubi nP. kolegów", result);
    }

    @Test
    public void miedzyInnymi() throws Exception {
        assertEquals("na przykład","np.",new AbbreviatorText(new TextInput("na przykład")).transform());
        assertEquals("Jurek lubi nP. kolegów",new AbbreviatorText(new TextInput("Jurek lubi na Przykład kolegów")).transform());
        assertEquals("M.in. Kuba nie zrobił nic przy projekcie",new AbbreviatorText(new TextInput("Między innymi Kuba nie zrobił nic przy projekcie")).transform());
        assertEquals("M.iN. Kuba nie zrobił nic przy projekcie",new AbbreviatorText(new TextInput("Między iNnymi Kuba nie zrobił nic przy projekcie")).transform());
    }
    @Test
    public void iTymPodobne() throws Exception {
        assertEquals("AAa itp. Bba",new AbbreviatorText(new TextInput("AAa i tym podobne Bba")).transform());
        assertEquals("Itp.",new AbbreviatorText(new TextInput("I tym podobne")).transform());
    }
}