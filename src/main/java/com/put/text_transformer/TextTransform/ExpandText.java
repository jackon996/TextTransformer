package com.put.text_transformer.TextTransform;

/**
 * Created by kacol on 21.01.18.
 */
public class ExpandText extends TextDecorator {
    public ExpandText(IText textInput) {
        super(textInput);
    }


    private String expander(String text) {
        String prof = "prof.";
        while (text.toLowerCase().contains(prof)) {
            int index = text.toLowerCase().indexOf(prof);
            logger.debug("Found \"{}\" at position {}.", prof, index);
            text = text.substring(0, index + 1) + "rofesor" + text.substring(index + prof.length());
        }
        String dr = "dr";
        while (text.toLowerCase().contains(dr)) {
            int index = text.toLowerCase().indexOf(dr);
            logger.debug("Found \"{}\" at position {}.", dr, index);
            text = text.substring(0, index + 1) + "oktor" + text.substring(index + dr.length());
        }
        String np = "np.";
        while (text.toLowerCase().contains(np)) {
            int index = text.toLowerCase().indexOf(np);
            logger.debug("Found \"{}\" at position {}.", np, index);
            text = text.substring(0, index + 1) + "a przykład" + text.substring(index + np.length());
        }
        String itd = "itd.";
        while (text.toLowerCase().contains(itd)) {
            int index = text.toLowerCase().indexOf(itd);
            logger.debug("Found \"{}\" at position {}.", itd, index);
            text = text.substring(0, index + 1) + " tak dalej" + text.substring(index + itd.length());
        }
        return text;
    }


    @Override
    public String transform() {
        return expander(textInput.transform());
    }
}
