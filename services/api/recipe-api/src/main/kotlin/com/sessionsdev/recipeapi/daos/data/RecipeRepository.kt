package com.sessionsdev.recipeapi.daos.data

import com.sessionsdev.recipeapi.entities.documents.RecipeDocument
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface RecipeRepository : MongoRepository<RecipeDocument, String>