package com.richo.test.graphql

import org.springframework.stereotype.Service

@Service
class AnimalRepository {

    private val animals = mutableListOf(
            Animal("Cat", true, "Kitty Cat"),
            Animal("Spider", false, "Spiders are bros")
    )

    val allLinks: List<Animal>
        get() = animals


    fun saveLink(animal: Animal) {
        animals.add(animal)
    }
}
