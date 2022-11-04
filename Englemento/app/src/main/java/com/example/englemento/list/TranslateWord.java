package com.example.englemento.list;

public class TranslateWord {

    String word;
    String translate;
    String exampleUsesRus;
    String exampleUsesEng;
    int number;

    public TranslateWord() {
    }

    public TranslateWord(int number,String word, String translate, String exampleUsesRus, String exampleUsesEng) {
        this.word = word;
        this.translate = translate;
        this.exampleUsesRus = exampleUsesRus;
        this.exampleUsesEng = exampleUsesEng;
        this.number = number;
    }


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getExampleUsesRus() {
        return exampleUsesRus;
    }

    public void setExampleUsesRus(String exampleUsesRus) {
        this.exampleUsesRus = exampleUsesRus;
    }

    public String getExampleUsesEng() {
        return exampleUsesEng;
    }

    public void setExampleUsesEng(String exampleUsesEng) {
        this.exampleUsesEng = exampleUsesEng;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
