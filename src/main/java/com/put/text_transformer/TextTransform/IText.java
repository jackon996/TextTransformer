package com.put.text_transformer.TextTransform;

/**
 * Created by Master Faster on 03.01.2018.
 * Interfejs z któego dziedziczy klasa TestDecorator i TextInput
 */
public interface IText {
    /**
     * Wspólna metoda wykonująca transformacje w zależności od klasy.
     * @return Tekst po dokonaniu odpowiedniej transformacji.
     */
    String transform();
}
