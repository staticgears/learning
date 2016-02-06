package com.learnings.six;


import java.util.Collection;
import java.util.Objects;

/**
 * @author Keith Banks.
 */
public class Main {
    public static void main(String[] args) {
        args = new String[] {"is"};
        SearchEngine engine = new Google();
        engine.load(getWords());
       if(args.length > 0 ) {
            Collection<String> result = engine.find(args[0]);
            System.out.println(Objects.toString(result));
        } else {
            System.err.println("Expected exactly 1 argument.");
        }
    }

    public static String getWords() {
        return "about about after again air all along also an and another any are around as at away back be because been before below between both but by came can come could day did different do does don't down each end even every few find first for found from get give go good great had has have he help her here him his home house how I if in into is it its just know large last left like line little long look made make man many may me men might more most Mr. must my name never new next no not now number of off old on one only or other our out over own part people place put read right said same saw say see she should show small so some something sound still such take tell than that the them then there these they thing think this those thought three through time to together too two under up us use very want water way we well went were what when where which while who why will with word work world would write year you your was";
    }
}