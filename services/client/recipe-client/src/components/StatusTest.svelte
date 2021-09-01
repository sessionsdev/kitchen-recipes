<script>
import { onMount } from "svelte";


    let status;

    onMount(async () => {
        await fetch(`http://localhost:8080/status`, {
            headers: {
    'Access-Control-Allow-Origin':'*',
  }
        })
        .then(response => response.json())
        .then(data => {
            status = data.status
        })
    })
</script>

<div>Status: {status}</div>