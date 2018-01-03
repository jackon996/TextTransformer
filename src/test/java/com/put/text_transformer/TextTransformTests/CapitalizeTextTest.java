package com.put.text_transformer.TextTransformTests;

import com.put.text_transformer.TextTransform.CapitalizeText;
import com.put.text_transformer.TextTransform.AbbreviatorText;
import com.put.text_transformer.TextTransform.TextInput;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CapitalizeTextTest {

    @Test
    public void oneWord() throws Exception {
        assertEquals("Ala",new CapitalizeText(new TextInput("ala")).transform());
        assertEquals(" Ala",new CapitalizeText(new TextInput(" ala")).transform());
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
