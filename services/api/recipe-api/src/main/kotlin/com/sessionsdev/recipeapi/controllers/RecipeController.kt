//package com.sessionsdev.recipeapi.controllers
//
//import com.sessionsdev.recipeapi.entities.business.RecipeRequest
//import com.sessionsdev.recipeapi.entities.business.Recipe
//import com.sessionsdev.recipeapi.services.RecipeService
//import org.springframework.http.ResponseEntity
//import org.springframework.web.bind.annotation.*
//
//@RestController
//@RequestMapping("/api/recipe")
//class RecipeController (private val recipeService: RecipeService) {
//
//    @PostMapping
//    fun createRecipe(@RequestBody request: RecipeRequest):
//            ResponseEntity<Recipe> {
//        val createdRecipe = recipeService.createRecipe(request)
//
//        return ResponseEntity.ok(
//            Recipe.fromEntity(createdRecipe)
//        )
//    }
//
//    @GetMapping
//    fun fineAllRecipes(): ResponseEntity<List<Recipe>> {
//        val recipes = recipeService.findAll()
//
//        return ResponseEntity.ok(
//            recipes.map {Recipe.fromEntity (it)}
//        )
//    }
//
//    @GetMapping("/{id}")
//    fun findRecipeById(@PathVariable id: String): ResponseEntity<Recipe> {
//        val recipe = recipeService.findById(id)
//
//        return ResponseEntity.ok(Recipe.fromEntity(recipe))
//    }
//
//    @PutMapping("/{id}")
//    fun updateRecipe(
//        @PathVariable id: String,
//        @RequestBody request: RecipeRequest
//    ) : ResponseEntity<Recipe> {
//        val updatedRecipe = recipeService.updateRecipe(id, request)
//
//        return ResponseEntity.ok(Recipe.fromEntity(updatedRecipe))
//    }
//
//    @DeleteMapping("/{id}")
//    fun deleteCompany(@PathVariable id: String): ResponseEntity<Void> {
//        recipeService.deleteById(id)
//
//        return ResponseEntity.noContent().build()
//    }
//}