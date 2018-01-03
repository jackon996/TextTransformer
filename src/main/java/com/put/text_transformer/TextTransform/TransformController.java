package com.put.text_transformer.TextTransform;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Master Faster on 03.01.2018.
 */
@RestController
@RequestMapping("/transform")
public class TransformController {

    @RequestMapping(value ="", method = RequestMethod.GET)
    public String getText(@RequestParam("text") String text){
        TextInput textInput = new TextInput(text);
        TextDecorator textDecorator = new UpperText(new InverseText(textInput));
        return textDecorator.transform();
    }

}
