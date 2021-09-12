<script>
  let showModal = false;
</script>

<div class="modal" class:is-active={showModal}>
    <div class="modal-background" on:click={() => (showModal = false)}></div>
    <div class="modal-content has-background-white py-5 px-5">
      <h3 class="title mb-6">Join the Club</h3>
      <form>
        <div class="field">
          <label class="label">Name</label>
          <div class="control">
            <input class="input" type="text" placeholder="Name">
          </div>
        </div>
        <div class="field">
          <label class="label">Email</label>
          <div class="control">
            <input class="input" type="email" placeholder="Email">
            <span class="icon is-small is-left">
              <i class="fas fa-envelope"></i>
            </span>
          </div>
        </div>
        <div class="field">
          <div class="control">
            <label class="checkbox">
              <input type="checkbox">
              I agree to the <a href="#">terms and conditions</a>
            </label>
          </div>
        </div>
        <div class="mt-6 has-text-centered">
          <button class="button is-warning">Sign Up</button>
        </div>
      </form>
    </div>
  </div>