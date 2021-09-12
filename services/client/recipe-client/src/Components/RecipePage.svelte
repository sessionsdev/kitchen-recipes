<script>
  import { onMount } from 'svelte'

  let showProductDetails = true;
	let showDeliveryInfo = false
  let showModal = false;

	const changeTabs = () => {
		showProductDetails = !showProductDetails
		showDeliveryInfo = !showDeliveryInfo
	}

  
  const loadRecipe = async () => {
    let recipeData = {}
    let recipeList = [];

      const recipes = await fetch(`http://localhost:8080/api/recipe`, {
          headers: {
  'Access-Control-Allow-Origin':'*',
    }
      })
      .then(response => response.json())
      .then((json) => {
        console.log(json)
        return json
      })

      recipeList = recipes


      const recipeId = recipeList[0].id
      const recipeResponse = await fetch(`http://localhost:8080/api/recipe/recipe_id`, {
          headers: {
  'Access-Control-Allow-Origin':'*',
    }
      }).then(response => response.json())

      recipeData = {...recipeResponse}
      console.log(recipeData)

      console.log(recipeData.directions)

      return recipeData
    }
    
</script>

{#await loadRecipe() then recipeData}
<section class="section">
    <div class="container">
      <div class="columns is-vcentered is-multiline">
        <div class="column is-6-tablet is-7-desktop">
          <h1 class="is-size-3-mobile is-size-1-desktop title">{recipeData.title}</h1>
          <h2 class="is-size-3-mobile is-size-2-desktop subtitle">Recipe by: {recipeData.author}</h2>
          <p>{recipeData.description}</p>
        </div>
        <div class="column is-6-tablet is-5-desktop has-text-right">
          <img src="https://loremflickr.com/500/500/buffulo" alt="docker coffee" class="px-6">
        </div>
      </div>
    </div>
  </section>

  <section class="section">
    <div class="container">
      <div class="columns is-variable is-8">
        <div class="column is-7-tablet">

          <!-- tabs -->
          <div class="tabs is-boxed is-centered is-large">
            <ul>
              <li class="is-active" class:is-active={showProductDetails} data-target="product-details" on:click={changeTabs}>
                <a>Ingredients</a> 
              </li>
              <li data-target="delivery-information" class:is-active={showDeliveryInfo} on:click={changeTabs}>
                <a>Directions</a>
              </li>
            </ul>
          </div>
          <div class="px-2" id="tab-content">
            <div id="product-details" class:is-hidden={!showProductDetails}>
              <h3 class="is-size-5 title">Ingredients</h3>
              <ul class="ingredient-list">
                  {#each recipeData.ingredients as ingredient}
                      <li>{ingredient}</li>
                  {/each}
              </ul>

            </div>
            <div id="delivery-information" class:is-hidden={!showDeliveryInfo}>
              <h3 class="is-size-5 title">Directions</h3>
              <ol class="ingredient-list">
                {#each Object.entries(recipeData.directions) as [stepNumber, direction]}
                    <li class="m-2">{direction.direction}</li>
                {/each}
              </ol>
            </div>
          </div>
        </div>
        <div class="column is-5-tablet">
          <!-- message box -->
          <div class="message is-dark">
            <div class="message-header">
              <p>Notes from the Author:</p>
            </div>
            <div class="message-body">
              <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Tempora incidunt repudiandae assumenda facilis maxime corporis inventore, nisi sunt quos officiis magnam totam tenetur est? Eius laudantium a veritatis eaque commodi?</p>
              <div class="has-text-centered">
                <button class="button mt-5" id="signup" on:click={() => (showModal = true)}>Sign Up</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  {/await}