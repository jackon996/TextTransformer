package com.put.text_transformer.TextTransformTests;

import com.put.text_transformer.TextTransform.TextAbbreviator;
import com.put.text_transformer.TextTransform.TextInput;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kacol on 03.01.18.
 */
public class TextAbbreviatorTest {

    @Test
    public void abbreviator() throws Exception {
        assertEquals("elo",new TextAbbreviator(new TextInput("elo")).transform());
        assertEquals("na przykład","np.",new TextAbbreviator(new TextInput("na przykład")).transform());
        assertEquals("NP.",new TextAbbreviator(new TextInput("NA PRZykład")).transform());
        assertEquals("Jurek lubi nP. kolegów",new TextAbbreviator(new TextInput("Jurek lubi na Przykład kolegów")).transform());
        assertEquals("M.in. Kuba nie zrobił nic przy projekcie",new TextAbbreviator(new TextInput("Między innymi Kuba nie zrobił nic przy projekcie")).transform());
        assertEquals("M.iN. Kuba nie zrobił nic przy projekcie",new TextAbbreviator(new TextInput("Między iNnymi Kuba nie zrobił nic przy projekcie")).transform());
        assertEquals("AAa itp. Bba",new TextAbbreviator(new TextInput("AAa i tym podobne Bba")).transform());
        assertEquals("Itp.",new TextAbbreviator(new TextInput("I tym podobne")).transform());
    }


}