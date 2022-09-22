package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("porsche")) {
            return "Porsche is a German automobile manufacturer. The specialize in developing " +
                    "high performance vehicles, from track machines like the 911 GT3 RS, " + 
                    "hypercars like the 918, and even electric cars like the Taycan." ;

        } else if (query.toLowerCase().contains("porsche")) {
            return "Porsche is a German automobile manufacturer. The specialize in developing " +
                    "high performance vehicles, from track machines like the 911 GT3 RS, " + 
                    "hypercars like the 918, and even electric cars like the Taycan." ;

        } else if (query.toLowerCase().contains("what is your name")) {
            return "Neeraj" ;
        }

        Pattern regex = Pattern.compile("which of the following is the largest number: (\\d+),(\\d+)");
        Matcher matcher = regex.matcher(query);
        boolean match1 = matcher.find();
        if (match1) {
            int num1 = Integer.parseInt(matcher.group(1));
            int num2 = Integer.parseInt(matcher.group(2));
            if(num1 > num2){
                return Integer.toString(num1);
            } else {
                return Integer.toString(num2);
            }
        }
        
        Pattern regex2 = Pattern.compile("what is (\\d+) + (\\d+)");
        Matcher matcher2 = regex2.matcher(query);
        boolean match2 = matcher2.find();
        if (match2) {
            int num1 = Integer.parseInt(matcher.group(1));
            int num2 = Integer.parseInt(matcher.group(2));
            return Integer.toString(num1 + num2);
        }
        return "";
    }
}
