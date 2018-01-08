package com.put.text_transformer.TextTransform;


public class TextDecorator implements IText {

    protected IText textInput;

    public TextDecorator(IText textInput){
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
