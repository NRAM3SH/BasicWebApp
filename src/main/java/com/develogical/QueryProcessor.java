package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("porsche")) {
            return "Porsche is a German automobile manufacturer. The specialize in developing " +
                    "high performance vehicles, from track machines like the 911 GT3 RS," + 
                    "hypercars like the 918, and even electric cars like the Taycan." ;

        }
        return "";
    }
}
