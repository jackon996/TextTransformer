package com.put.text_transformer.TextTransform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Klasa zawijająca skróty "na przykład" -> "np.". Uwzględnia rozmiar liter.
 */
public class AbbreviatorText extends TextDecorator {
    final Logger logger = LoggerFactory.getLogger(AbbreviatorText.class);
    /**
     * Konstruktor będący dekoratorem.
     * @param textInput Interfejs zapewniający możliwość transformacji na tekście.
     */
    public AbbreviatorText(IText textInput) {
        super(textInput);
    }

    /**
     * Przetwarzanie wybranych wyrazów na skróty.
     * @param text Tekst do przetworzenia z rozwiniętym skrótem.
     * @return  Przetworzony tekst.
     */
    public String abbreviator(String text){
        String np = "na przykład";
        while(text.toLowerCase().contains(np)){
            int index = text.toLowerCase().indexOf(np);
            logger.debug("Found \"{}\" at position {}.", np, index);
            text = text.substring(0, index+1) + text.substring(index+3, index+4)+"." + text.substring(index+np.length());
        }
        String min = "między innymi";
        while(text.toLowerCase().contains(min)){
            int index = text.toLowerCase().indexOf(min);
            logger.debug("Found \"{}\" at position {}.", min, index);
            text = text.substring(0, index+1)+ "." + text.substring(index+7, index+9) + "." + text.substring(index+min.length());
        }
        String itp = "i tym podobne";
        while(text.toLowerCase().contains(itp)){
            int index = text.toLowerCase().indexOf(itp);
            logger.debug("Found \"{}\" at position {}.", itp, index);
            text = text.substring(0, index+1) + text.substring(index+2, index+3)+ text.substring(index+6, index+7)+ "." + text.substring(index+itp.length());
        }
        return text;
    }

    /**
     * Implementacja interfejsu.
     * @return  Tekst zawierający wyvrane, zwinięte skróty.
     */
    @Override
    public String transform() {
        return abbreviator(super.transform());
    }

}
