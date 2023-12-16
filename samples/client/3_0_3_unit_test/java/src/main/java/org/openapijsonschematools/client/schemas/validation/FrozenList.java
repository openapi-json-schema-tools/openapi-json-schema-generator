package org.openapijsonschematools.client.schemas.validation;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FrozenList<E> extends AbstractList<E> {
    /*
    A frozen List
    Once schema validation has been run, indexed access returns values of the correct type
    If values were mutable, the types in those methods would not agree with returned values
     */
    private final List<E> list;
    public FrozenList(Collection<? extends E> m) {
        super();
        list = new ArrayList<>(m);
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }
}

