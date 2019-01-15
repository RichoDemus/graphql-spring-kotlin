package com.richo.test.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Service

@Service
class Query(private val animalRepository: AnimalRepository = AnimalRepository()) : GraphQLQueryResolver {

    fun allAnimals(): List<Animal> {
        return animalRepository.allLinks
    }
}
