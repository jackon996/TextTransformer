package com.put.text_transformer.TextTransform;


public class TextDecorator implements IText {

    protected IText textInput;

    /**
     * @param textInput to be transformed.
     */
    public TextDecorator(IText textInput){
        this.textInput = textInput;
    }

    /**
     * @return Transformation.
     */
    @Override
    public String transform() {
        return this.textInput.transform();
    }
}
