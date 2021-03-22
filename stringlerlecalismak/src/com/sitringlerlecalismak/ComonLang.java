package com.sitringlerlecalismak;


import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

public class ComonLang {

    public void whenMultilineString_thenReturnNonEmptyLineCount() {
        String multilineStr = "This is\n \n a multiline\n string.";

        long lineCount = multilineStr.lines()
                .filter(String::isBlank)
                .count();

        is(lineCount).equals(3L);
    }
}