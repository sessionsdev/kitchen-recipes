<script>
    let recipeBrief = {
        title: "Creamy Buffulo Sauce",
        author: "Ethan Chlebowski",
        thumbNail: "https://loremflickr.com/320/240/food",
        descriptionBreif: ""
    }

</script>

<div class="card">
    <div class="card-image">
      <figure class="image is-4by3">
        <img src={recipeBrief.thumbNail} alt="Placeholder image">
      </figure>
    </div>

    <div class="card-content">
      <div class="media">
        <div class="media-content">
          <p class="title is-4">{recipeBrief.title}</p>
          <p class="subtitle is-6">Author: {recipeBrief.author}</p>
        </div>
      </div>
  
      <div class="content">
          <div>
              Everyone should have creamy buffalo sauce in their fridge 
              because you can use it in 3 different cooking techniques, in my opinion, 
              this is one of those rare occasions where the lower-calorie version is better. 
              How will you use it?
          </div>
        <br>
    </div>
    <button class="button is-fullwidth is-primary is-outlined">View Recipe</button>
    </div>
  </div>