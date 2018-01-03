package com.put.text_transformer.TextTransform;

/**
 * Created by Master Faster on 03.01.2018.
 */
public class InverseText extends TextDecorator {

    public InverseText(IText textInput){
        super(textInput);
    }

    @Override
    public String transform(){
        String text = textInput.transform();
        StringBuffer buffer = new StringBuffer(text.toLowerCase());
        StringBuffer buffer2 = buffer.reverse();
        String inversedText="";
        for(int i = 0;i <buffer.length();i++)
        {
            if(Character.isUpperCase(text.charAt(i))==true)
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
