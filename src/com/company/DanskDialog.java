package com.company;

public class DanskDialog implements Dialog {
    @Override
    public String greetings() {
        return "hallo";
    }

    @Override
    public String AskForcontinue() {
        return "ønsker du at fortsætte?";
    }

    @Override
    public String AskForLanguageChange() {
        return  "ønsker du at skifte sprog? ";
    }

    @Override
    public String Goodbye() {
        return "Tak for i dag";
    }
}
