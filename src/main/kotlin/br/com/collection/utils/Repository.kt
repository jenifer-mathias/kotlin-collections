package br.com.collection.utils

class Repository<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        map[id] = value // put
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map[id] // get

    fun findAll() = map.values
}