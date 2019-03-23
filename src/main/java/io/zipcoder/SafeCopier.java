package io.zipcoder;

import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier{
    ReentrantLock reentrantLock = new ReentrantLock();

    public SafeCopier(String toCopy) {
        super(toCopy);
    }

    @Override
    public void run() {
        Iterator<String> iterator = stringIterator;
        reentrantLock.lock();

        while(iterator.hasNext()) {
            copied += iterator.next() + " ";
        }
    }
}
