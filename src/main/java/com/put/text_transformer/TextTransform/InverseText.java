package com.put.text_transformer.TextTransform;

/**
 * Klasa odwracająca tekst.
 */
public class InverseText extends TextDecorator {

    public InverseText(IText textInput){
        super(textInput);
    }

    /**
     * Odwrócenie kolejności liter w zdaniu z zachowaniem kolejnosci wielkich liter
     * @return zwrócenie przetworzonego tekstu
     */
    @Override
    public String transform(){
        String text = textInput.transform();
        StringBuffer buffer = new StringBuffer(text.toLowerCase());
        StringBuffer buffer2 = buffer.reverse();
        String inversedText="";
        for(int i = 0;i <buffer.length();i++)
        {
            if(Character.isUpperCase(text.charAt(i)))
            {
                inversedText+=Character.toUpperCase(buffer2.charAt(i));
            }
            else
            {
                inversedText+=Character.toLowerCase(buffer2.charAt(i));
            }
        }

        return inversedText;
    }
}
