package com.sessionsdev.recipeapi.entities.documents

import org.springframework.data.mongodb.core.mapping.Document

@Document("recipes")
data class RecipeDocument(
    val id: String? = null,
    var name: String
)
