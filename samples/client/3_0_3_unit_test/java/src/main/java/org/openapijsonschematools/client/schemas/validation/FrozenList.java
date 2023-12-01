package org.openapijsonschematools.client.schemas.validation;

import java.util.ArrayList;
import java.util.Collection;

public class FrozenList<E> extends ArrayList<E> {
    /*
    A frozen List
    Once schema validation has been run, indexed access returns values of the correct type
    If values were mutable, the types in those methods would not agree with returned values
     */
    public FrozenList(Collection<? extends E> m) {
        super(m);
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    public E remove(int index) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
}
