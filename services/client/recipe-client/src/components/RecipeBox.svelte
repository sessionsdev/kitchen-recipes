<script>
    let title ="Creamy Buffalo Sauce";

    let ingredients = [
        "60 g butter, melted",
        "120 g hot sauce",
        "60 g plain yogurt",
        "Fresh ground black pepper",
        "Garlic powder",
        "Lemon zest",
        "Pinch of MSG"
    ]

    let instructions = {
        1: "Add the butter to a pan over medium heat. When the butter has started to bubble, add the hot sauce and stir continuously to form an emulsified sauce between the two. Pull the pan off the heat and let cool for 2-3 minutes.",
        2: "Once cooled, add the plain yogurt and stir to combine. Follow that with a couple cranks of black pepper, sprinkle of garlic powder, lemon zest, and a pinch of msg. The msg will mellow out the spiciness of the sauce.",
        3: "Pour into a squeeze bottle and store in the fridge. Use as a dipping sauce, a marinade for chicken, or as a salad dressing. You've got options, baby."
    }
</script>

<div class="bg-gray-200 shadow-lg rounded-lg my-20 mx-64 text-justify px-10 py-8 flex flex-col border-2 border-black">
    
    <h1 class="text-center  font-bold text-3xl">{title}</h1>
    <p class="text-sm text-right"><span class="font-bold mr-1">Author:</span>SessionsDev</p>
    <br>

    <h2 class="text-xl font-semibold">Ingredients</h2>
    <ul class="pl-10 pt-2">
        {#each ingredients as i}
        <li >
            <input type="checkbox" class="form-checkbox h-3 w-3">
            <span class="ml-1">{i}</span>
        </li>
        {/each}
    </ul>
    <br>
    <h2 class="text-xl font-semibold">Instructions</h2>
    <ol class="list-decimal pl-8">
        {#each Object.entries(instructions) as [number, instruction]}
        <li class="m-2">{instruction}</li>
        {/each}
    </ol>
</div>
