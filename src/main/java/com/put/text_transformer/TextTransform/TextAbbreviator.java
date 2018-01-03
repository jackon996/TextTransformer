package com.put.text_transformer.TextTransform;

/**
 * Created by kacol on 03.01.18.
 */
public class TextAbbreviator extends TextDecorator {
    public TextAbbreviator(IText textInput) {
        super(textInput);
    }



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

    @Override
    public String transform() {
        return abbreviator(super.transform());
    }

}
