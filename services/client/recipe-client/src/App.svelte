<script>
import Breadcrumbs from "./Components/Breadcrumbs.svelte";
import CardGrid from "./Components/CardGrid.svelte";
import Footer from "./Components/Footer.svelte";
import Main from "./Components/Main.svelte";
import Modal from "./Components/Modal.svelte";
import NavBar from "./Components/NavBar.svelte";
import RecipePage from "./Components/RecipePage.svelte";
import Status from "./Components/Status.svelte";

import { Router, Link, Route } from 'svelte-routing'; 

export let url = "";

</script>


<Router url ="{url}">

	<div>
		<Route path="/status" component="{Status}" />
		<Route path="/"><Main /></Route>
	</div>
</Router>


<main>
	<!-- <Main /> -->

</main>

  <style>
  </style>