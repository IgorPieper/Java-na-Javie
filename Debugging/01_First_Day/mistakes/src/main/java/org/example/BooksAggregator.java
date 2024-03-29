package org.example;

import org.example.model.Person;
import org.example.model.Samples;

import java.util.Random;

public class BooksAggregator {

    public void aggregateBooksThroughPeople(){

        for (Person person: Samples.getSampleListOfPeople())
        {
            int index = getRandomIndex();
            person.getBooks().add(Samples.getAvailableBooks().get(index));
        }

    }
    private int getRandomIndex(){
        return new Random().nextInt(Samples.getAvailableBooks().size()+5);
    }


}
