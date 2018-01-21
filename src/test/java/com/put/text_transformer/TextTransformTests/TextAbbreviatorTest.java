package com.put.text_transformer.TextTransformTests;

import com.put.text_transformer.TextTransform.AbbreviatorText;
import com.put.text_transformer.TextTransform.TextInput;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kacol on 03.01.18.
 */
public class TextAbbreviatorTest {

    @Test
    public void naPrzyklad() throws Exception {
        assertEquals("na przykład","np.",new AbbreviatorText(new TextInput("na przykład")).transform());
        assertEquals("Jurek lubi nP. kolegów",new AbbreviatorText(new TextInput("Jurek lubi na Przykład kolegów")).transform());
        assertEquals("NP.",new AbbreviatorText(new TextInput("NA PRZykład")).transform());
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