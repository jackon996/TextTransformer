package com.put.text_transformer.TextTransform;

import com.put.text_transformer.TextTransform.IText;

/**
 * Created by Master Faster on 03.01.2018.
 * Obiekt, który będzie dekorowany przez dekoratory
 */
public class TextInput implements IText {

    /**
     *tekst przetwarzany przez dekoratory
     */
    private String text;

    public TextInput(String text){
        this.text = text;
    }

    /**
     * @return zwrócenie oryginalnego tekstu
     */
    @Override
    public String transform() {
        return this.text;
    }
}
