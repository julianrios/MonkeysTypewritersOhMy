package io.zipcoder;

import java.util.Iterator;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {
    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        Iterator<String> iterator = stringIterator;
        while (iterator.hasNext()) {
            copied += iterator.next() + " ";
        }
    }
}
