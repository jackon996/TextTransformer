package com.put.text_transformer.TextTransform;

/**
 * Created by Master Faster on 03.01.2018.
 */
public class LowerText extends TextDecorator {

    public LowerText(IText textInput){
        super(textInput);
    }

    /**
     * zamiana liter na małe litery
     * @return zwrócenie przetworzonego tekstu
     */
    @Override
    public String transform(){
        String text = textInput.transform();

        return text.toLowerCase();
    }
}