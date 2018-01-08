package com.put.text_transformer.TextTransform;

/**
 * Created by Master Faster on 03.01.2018.
 * Obiekt, który będzie dekorowany przez dekoratory
 */
public class TextInput implements IText {

    private String text;
    private String[] transformTable;

    public TextInput(){ }

    public TextInput(String text){
        this.setText(text);
    }

    public TextInput(String text, String[] transformTable){
        this.setText(text);
        this.transformTable = transformTable;
    }

    /**
     * @return zwrócenie oryginalnego tekstu
     */
    @Override
    public String transform() {
        return this.getText();
    }

    public String[] getTransformTable() {
        return transformTable;
    }

    public void setTransformTable(String[] transformTable) {
        this.transformTable = transformTable;
    }

    /**
     *tekst przetwarzany przez dekoratory
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
