package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Nico";
        } else if (query.contains("plus")) {
            String [] strings = query.split(" ");
            int result = Integer.parseInt(strings[strings.length - 1]) + Integer.parseInt(strings[strings.length - 3]);
            return "" + result;
        // } else if (query.contains("largest")) {
        //     String [] strings = query.split(" ");
        // return "Nico";
        // } else if (query.contains("name")) {
        // return "Nico";
        } else { // TODO extend the programm here
        return "";
        }
    }
}
