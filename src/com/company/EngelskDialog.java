package com.company;

public class EngelskDialog implements Dialog{
    @Override
    public String greetings() {
        return "hello";
    }

    @Override
    public String AskForcontinue() {
        return "do you want to continue?";
    }

    @Override
    public String AskForLanguageChange() {
        return "do you want to change language? ";
    }

    @Override
    public String Goodbye() {
        return "Goodbye my friend";
    }
}
