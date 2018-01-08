package com.put.text_transformer.TextTransform;

/**
 * Klasa o wspólnym interfejsie TextDecorator służąca do ustawiania wszystkich liter wyrazu na wielkie litery.
 */
public class UpperText extends TextDecorator {

    public UpperText(IText textInput){
        super(textInput);
    }

    /**
     * zamiana liter na wielkie litery
     * @return zwrócenie przetworzonego tekstu
     */
    @Override
    public String transform(){
        String text = textInput.transform();

        return text.toUpperCase();
    }
}
