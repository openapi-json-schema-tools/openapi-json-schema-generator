package org.openapijsonschematools.client.schemas.validation

open class FrozenList<E>(m: Collection<E>) : AbstractList<E>() {
    /*
    A frozen List
    Once schema validation has been run, indexed access returns values of the correct type
    If values were mutable, the types in those methods would not agree with returned values
     */
    private val list: List<E>

    init {
        list = ArrayList(m)
    }

    override val size: Int
        get() = list.size

    override fun get(index: Int): E {
        return list[index]
    }
}

