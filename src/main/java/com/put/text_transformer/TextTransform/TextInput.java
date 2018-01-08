package com.put.text_transformer.TextTransform;

/**
 * Klasa, której instancja będzie przetwarzana przez dekorator.
 */
public class TextInput implements IText {
    /**
     * Tekst do przetworzenia.
     */
    private String text;
    /**
     * Tablica zawierająca sekwencje do przetworzenia.
     */
    private String[] transformTable;

    public TextInput(){ }

    public TextInput(String text){
        this.setText(text);
    }

    /**
     * Konstruktor wykorzystywany przez kontroler.
     * @param text Tekst do przetworzenia podany w zapytaniu.
     * @param transformTable Tablica zawierająca sekwencje do przetworzenia.
     */
    public TextInput(String text, String[] transformTable){
        this.setText(text);
        this.transformTable = transformTable;
    }

    /**
     * @return Zwraca oryginalny tekst.
     */
    @Override
    public String transform() {
        return this.getText();
    }

    /**
     * Pobiera łańcuch transformacji.
     * @return Tablica typu string zawierająca sekwencje transformacji.
     */
    public String[] getTransformTable() {
        return transformTable;
    }

    /**
     * Setter zmiennej.
     * @param transformTable nowa tablica z sekwencją transformacji.
     */
    public void setTransformTable(String[] transformTable) {
        this.transformTable = transformTable;
    }

    /**
     * Zwraca teskt przetwarzany przez dekoratory.
     * @return Tekst do przetworzenia.
     */
    public String getText() {
        return text;
    }

    /**
     * Ustawia tekst do przetworzenia.
     * @param text Nowy tekst do przetworzenia.
     */
    public void setText(String text) {
        this.text = text;
    }
}
