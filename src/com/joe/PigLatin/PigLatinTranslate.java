package com.joe.PigLatin;

/**
 * Created by Joseph on 11/7/2014.
 */
class PigLatinTranslate
{
    public static String translateToPL(String phrase) {
        String[] words = phrase.split(" ");
        String result = "";
        
        for(int i=0; i < words.length; i++) {
            String parts = "";
            
            if (words[i].toLowerCase().equals(words[i])) {
                parts += words[i].substring(1,2);
            }
            else {
                parts += words[i].substring(1,2).toUpperCase();
            }

            /*TODO: Use regex to check for words that start with vowels to add "way" instead of "ay" at the end.*/

            parts += words[i].substring(2) + words[i].substring(0,1).toLowerCase() + "ay" + (i < words.length-1 ? " " : "");
            result += parts;
        }

        result = result.substring(0,1).toUpperCase() + result.substring(1).toLowerCase();

        return result;
    }
}

