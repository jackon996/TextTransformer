package com.put.text_transformer.TextTransform;

import org.springframework.web.bind.annotation.*;


/**
 * Created by Master Faster on 03.01.2018.
 * Kontroler uruchamiający odpowiednie metody w zależności od polecenia w sekwencji.
 */
@RestController
@RequestMapping("/transform")
public class TransformController {

    /**
     * Wykonanie żądania POST
     * @param textInput  tekst do przetworzenia wraz z kolejnymi transformacjami
     * @return  zwrócenie przetworzonego tekstu
     */
    @RequestMapping(value ="", method = RequestMethod.POST, produces = "application/json")
    public void getText(@RequestBody TextInput textInput){
        TextDecorator textDecorator = new TextDecorator(textInput);
        for(String transformation : textInput.getTransformTable()){
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
            if(transformation.equals("capitalize")){
                System.out.println("Capitalizing text...");
                textDecorator = new CapitalizeText(textDecorator);
            }
            if(transformation.equals("abbreviation")){
                System.out.println("Abbreviationing text...");
                textDecorator = new AbbreviatorText(textDecorator);
            }
        }

        System.out.println(textDecorator.transform());
    }

}
