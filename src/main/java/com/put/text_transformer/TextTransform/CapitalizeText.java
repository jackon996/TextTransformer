package com.put.text_transformer.TextTransform;

import org.springframework.util.StringUtils;

/**
 * Klasa przekształcająca tekst w kapitaliki.
 */
public class CapitalizeText extends TextDecorator{

    public CapitalizeText(IText textInput){
        super(textInput);
    }

    /**
     * Zamiana pierwszych liter w słowie na wielkie litery
     * @return zwrócenie przetworzonego tekstu
     */
    @Override
    public String transform(){
        String text = textInput.transform();
        String capitalizedText="";
        boolean capitalize=false;
        for(int i=0;i<text.length();i++)
        {
            if(capitalize)
            {
                capitalizedText+=Character.toUpperCase(text.charAt(i));
                capitalize=false;
            }
            else
            {
                capitalizedText+=text.charAt(i);
            }
            if(text.charAt(i)==' ')
            {
                capitalize=true;
            }
        }
        capitalizedText=StringUtils.capitalize(capitalizedText);
        return capitalizedText;
    }
}
