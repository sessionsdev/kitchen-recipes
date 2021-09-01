db.auth('root', 'password')

db.createUser(
    {
        user: "sessionsdev",
        pwd: "password",
        roles: [
            {
                role: "readWrite",
                db: "recipes"
            }
        ]
    }
)

db.recipes.insert({
    name: "test recipe",
    ingredientNumber: 4
})