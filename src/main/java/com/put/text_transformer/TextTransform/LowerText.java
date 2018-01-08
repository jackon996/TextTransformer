package com.put.text_transformer.TextTransform;

/**
 * Klasa konwertująca wszystkie litery na małe.
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