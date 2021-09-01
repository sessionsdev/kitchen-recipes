package com.sessionsdev.recipeapi.entities.documents

import org.springframework.data.mongodb.core.mapping.Document

@Document("authors")
data class AuthorDocument(
    val id: String? = null,
    var firstName: String,
    var lastName: String
)