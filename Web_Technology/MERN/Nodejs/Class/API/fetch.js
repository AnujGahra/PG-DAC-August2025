



fetch("https://api.github.com/users/octocat")
.then(res => res.json())
.then(data => console.log(data))
.catch((error) => console.error(error, error.message, error.code));