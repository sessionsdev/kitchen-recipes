package com.sessionsdev.recipeapi.entities.business

data class Recipe (
    val id: String,
    val name: String,
    val ingredients: List<Ingredient>,
    val recipeInstruction: List<RecipeInstruction>,
    val author: Author
    )

//        ) {
//    companion object {
//        fun fromEntity(recipeDocument: RecipeDocument): Recipe =
//            Recipe(
//                id = recipeDocument.id!!,
//                name = recipeDocument.name,
//            )
//    }