package com.put.text_transformer.TextTransform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



/**
 * Kontroler uruchamiający odpowiednie metody w zależności od polecenia w sekwencji.
 */
@CrossOrigin
@RestController
@RequestMapping("/transform")
public class TransformController {
    final Logger logger = LoggerFactory.getLogger(TransformController.class);
    /**
     * Wykonanie żądania POST
     * @param textInput  tekst do przetworzenia wraz z kolejnymi transformacjami
     * @return  zwrócenie przetworzonego tekstu
     */
    @RequestMapping(value ="", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<TextInput> getText(@RequestBody TextInput textInput){
        TextDecorator textDecorator = new TextDecorator(textInput);
        if(textInput.getText().isEmpty())
        {
            logger.warn("Input text is empty!");
        }
        for(String transformation : textInput.getTransformTable()){
            if(transformation.equals("inverse")){
                logger.info("Inversing text...");
                textDecorator = new InverseText(textDecorator);
            }
            if(transformation.equals("upper")){
                logger.info("Uppering text...");
                textDecorator = new UpperText(textDecorator);
            }
            if(transformation.equals("lower")){
                logger.info("Lowering text...");
                textDecorator = new LowerText(textDecorator);
            }
            if(transformation.equals("capitalize")){
                logger.info("Capitalizing text...");
                textDecorator = new CapitalizeText(textDecorator);
            }
            if(transformation.equals("abbreviation")){
                logger.info("Abbreviationing text...");
                textDecorator = new AbbreviatorText(textDecorator);
            }
            if(transformation.equals("expand")){
                logger.info("Expanding text...");
                textDecorator = new ExpandText(textDecorator);
            }
        }

        TextInput response = new TextInput(textDecorator.transform(), textInput.getTransformTable());
        logger.info("Transformed: ".concat(response.getText()));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
