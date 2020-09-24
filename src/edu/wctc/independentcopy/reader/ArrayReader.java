package edu.wctc.independentcopy.reader;

import java.util.ArrayList;


public class ArrayReader implements edu.wctc.independentcopy.reader.Reader {



    @Override
    public String readln() {

        ArrayList<String> listOfQuotes = new ArrayList<>();

        listOfQuotes.add("There is only one Lord of the Ring, only one who can bend it to his will. And he does not share power.");
        listOfQuotes.add("That there’s some good in this world, Mr. Frodo… and it’s worth fighting for.");
        listOfQuotes.add("Even the smallest person can change the course of the future.");

        return listOfQuotes.get(1);
    }


}
