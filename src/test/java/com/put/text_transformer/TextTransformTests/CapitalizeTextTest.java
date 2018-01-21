package com.put.text_transformer.TextTransformTests;

import com.put.text_transformer.TextTransform.CapitalizeText;
import com.put.text_transformer.TextTransform.IText;
import com.put.text_transformer.TextTransform.InverseText;
import com.put.text_transformer.TextTransform.TextInput;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CapitalizeTextTest {

    @Test
    public void oneWordMock() throws Exception {
        IText mockObject = mock(IText.class);
        when(mockObject.transform()).thenReturn("ala");
        CapitalizeText testedObject = new CapitalizeText(mockObject);
        String result = testedObject.transform();
        verify(mockObject).transform();
        assertEquals("Ala", result);
    }
    @Test
    public void multipleWords() throws Exception {
        assertEquals("Ala Ma Kota",new CapitalizeText(new TextInput("ala ma kota")).transform());
        assertEquals("Poranna Rosa Na Zielonej Trawie",new CapitalizeText(new TextInput("Poranna rosa na zielonej trawie")).transform());
    }
    @Test
    public void manyWhitespaces() throws Exception {
        assertEquals("Ala    Ma  Kota",new CapitalizeText(new TextInput("ala    ma  kota")).transform());
        assertEquals(" Ala Ma    *kota",new CapitalizeText(new TextInput(" ala ma    *kota")).transform());
    }

}
