<script>
    import CardGrid from "./CardGrid.svelte";
import RecipeBox from "./RecipeBox.svelte";
import RecipePage from "./RecipePage.svelte";
import SideNav from "./SideNav.svelte";
  
  </script>
  
  <div class="text-gray-600 font-primary grid md:grid-cols-4">
      <div class="md:col-span-1 md:flex md:justify-end">
        <SideNav />
      </div>
    
      <main class="px-6 py-6 bg-gray-100 md:col-span-3">
        <div class="flex justify-center md:justify-end">
          <a href="#" class="text-primary btn border-primary md:border-2 hover:bg-primary hover:text-white transistion ease-out duration-500">Log in</a>
          <a href="#" class="text-primary ml-2 btn border-primary md:border-2 hover:bg-primary hover:text-white transistion ease-out duration-500">Sign up</a>
        </div>
  
        <header>
          <h2 class="text-grey-900 text-6xl font-semibold">Recipes</h2>
          <h3 class="text-2xl font-semibold">From Colleen's Kitchen</h3>
        </header>

        <!-- <RecipePage /> -->
  
        <div class="col-span-3">
          <h4 class="font-bold mt-12 pb-2 border-b border-gray-200">Latest Recipes</h4>
          <CardGrid />
  
  
          <h4 class="font-bold mt-12 pb-2 border-b border-gray-200">Most Popular</h4>
  
          <div class="mt-8 grid lg:grid-cols-3 gap-10">
            
          </div>
        </div>
  
        <div class="flex justify-center">
          <div class="bg-secondary-100 text-secondary-200 btn hover:shadow-inner transform hover:scale-125 hover:bg-opacity-50 transition ease-out duration-300">Load more</div>
        </div>    
      </main>
  </div>