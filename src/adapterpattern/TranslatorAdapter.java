/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author nguyennh
 */
public class TranslatorAdapter implements VietnameseTarget {

    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading words ...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        System.out.println("Sending words ...");
        adaptee.receive(vietnameseWords);
    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated");
        return "こんにちは";
    }

}
