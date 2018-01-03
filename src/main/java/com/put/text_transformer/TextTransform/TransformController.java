package com.put.text_transformer.TextTransform;


import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Master Faster on 03.01.2018.
 */
@RestController
@RequestMapping("/transform")
public class TransformController {

    @RequestMapping(value ="", method = RequestMethod.GET)
    public String getText(@RequestParam("text") String text,
                            @RequestParam("transformTable") String[] transformTable){
        TextInput textInput = new TextInput(text);
        TextDecorator textDecorator = new TextDecorator(textInput);// = new UpperText(new InverseText(textInput));
        for(String transformation : transformTable){
            if(transformation.equals("inverse")){
                System.out.println("Inversing text...");
                textDecorator = new InverseText(textDecorator);
            }
            if(transformation.equals("upper")){
                System.out.println("Uppering text...");
                textDecorator = new UpperText(textDecorator);
            }
            if(transformation.equals("lower")){
                System.out.println("Lowering text...");
                textDecorator = new LowerText(textDecorator);
            }
        }


        return textDecorator.transform();
    }

}
