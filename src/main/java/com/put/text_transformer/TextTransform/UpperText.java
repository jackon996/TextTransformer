package com.put.text_transformer.TextTransform;

/**
 * Created by Master Faster on 03.01.2018.
 */
public class UpperText extends TextDecorator {

    /**
     * @param textInput injected IText interface.
     */
    public UpperText(IText textInput){
        super(textInput);
    }

    /**
     * @return Transformation that uppers all characters in the text.
     */
    @Override
    public String transform(){
        String text = textInput.transform();

        return text.toUpperCase();
    }
}
