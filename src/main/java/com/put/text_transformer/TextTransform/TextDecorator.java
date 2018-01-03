package com.put.text_transformer.TextTransform;


/**
 * Created by Master Faster on 03.01.2018.
 */
public class TextDecorator implements IText {

    protected IText textInput;

    public TextDecorator(IText textInput){
        this.textInput = textInput;
    }

    @Override
    public String transform() {
        return this.textInput.transform();
    }
}
