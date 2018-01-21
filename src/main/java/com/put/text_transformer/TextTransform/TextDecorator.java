package com.put.text_transformer.TextTransform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Klasa dekoratora.
 */
public class TextDecorator implements IText {
    final Logger logger = LoggerFactory.getLogger(TextDecorator.class);
    protected IText textInput;

    public TextDecorator(IText textInput){
        if(textInput == null)
        {
            logger.error("Text input is null!");
        }
        this.textInput = textInput;
    }

    /**
     * @return Transformation Tekst po dokonanej transformacji.
     */
    @Override
    public String transform() {
        return this.textInput.transform();
    }
}
