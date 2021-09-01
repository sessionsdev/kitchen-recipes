package com.sessionsdev.recipeapi.services

import com.sessionsdev.recipeapi.daos.data.RecipeRepository
import com.sessionsdev.recipeapi.entities.business.Recipe
import com.sessionsdev.recipeapi.entities.business.RecipeRequest
import com.sessionsdev.recipeapi.entities.documents.RecipeDocument
import com.sessionsdev.recipeapi.exceptions.NotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class RecipeService (private val recipeRepository: RecipeRepository){
    fun createRecipe(request: RecipeRequest): RecipeDocument =
        recipeRepository.save(
            RecipeDocument(
                name = request.name
            )
        )

    fun findAll(): List<RecipeDocument> =
        recipeRepository.findAll()

    fun findById(id: String): RecipeDocument {

        val recipeDocument = recipeRepository.findByIdOrNull(id) ?: throw NotFoundException("")

//        val recipe = Recipe.fromEntity(recipeDocument)7

        return recipeRepository.findById(id).orElseThrow {
            NotFoundException("Recipe with id $id not found.")
        }
    }


    fun updateRecipe(id: String, request: RecipeRequest): RecipeDocument {
        val recipeToUpdate = findById(id)

        val updatedRecipe = recipeRepository.save(
            recipeToUpdate.apply {
                name = request.name
            }
        )

        return updatedRecipe
    }

    fun deleteById(id: String) {
        val recipeToDelete = findById(id)

        recipeRepository.delete(recipeToDelete)
    }
}