package com.put.text_transformer.TextTransform;

/**
 * Created by kacol on 03.01.18.
 * Klasa zawijająca skróty "na przykład" -> "np.". Uwzględnia rozmiar liter.
 */
public class AbbreviatorText extends TextDecorator {
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
            text = text.substring(0, index+1) + text.substring(index+3, index+4)+"." + text.substring(index+np.length());
        }
        String min = "między innymi";
        while(text.toLowerCase().contains(min)){
            int index = text.toLowerCase().indexOf(min);
            text = text.substring(0, index+1)+ "." + text.substring(index+7, index+9) + "." + text.substring(index+min.length());
        }
        String itp = "i tym podobne";
        while(text.toLowerCase().contains(itp)){
            int index = text.toLowerCase().indexOf(itp);
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
