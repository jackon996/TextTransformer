package com.put.text_transformer.TextTransform;

import org.springframework.util.StringUtils;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapitalizeText extends TextDecorator{

    public CapitalizeText(IText textInput){
        super(textInput);
    }

    @Override
    public String transform(){
        String text = textInput.transform();
        String capitalizedText="";
        boolean capitalize=false;
        for(int i=0;i<text.length();i++)
        {
            if(capitalize==true)
            {
                capitalizedText+=Character.toUpperCase(text.charAt(i));
                capitalize=false;
            }
            else
            {
                capitalizedText+=text.charAt(i);
            }
            if(text.charAt(i)==' ') capitalize=true;
        }
        capitalizedText=StringUtils.capitalize(capitalizedText);
        return capitalizedText;
    }
}
