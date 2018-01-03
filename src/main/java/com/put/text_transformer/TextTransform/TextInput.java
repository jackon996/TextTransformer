package com.put.text_transformer.TextTransform;

import com.put.text_transformer.TextTransform.IText;

/**
 * Created by Master Faster on 03.01.2018.
 */
public class TextInput implements IText {
    private String text;

    public TextInput(String text){
        this.text = text;
    }

    @Override
    public String transform() {
        return this.text;
    }
}
