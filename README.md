# SafeBoda Android Code Challenge

Clone the repository

Create a simple application that shows a list of public APIs description returned from a network call

Keep the UI simple, a list tile with the API name, description, and link will do just fine

The api response:

```JSON
{
  "count": 1425,
  "entries": [
    {
      "API": "AdoptAPet",
      "Description": "Resource to help get pets adopted",
      "Auth": "apiKey",
      "HTTPS": true,
      "Cors": "yes",
      "Link": "https://www.adoptapet.com/public/apis/pet_list.html",
      "Category": "Animals"
    },
    {
      "API": "Axolotl",
      "Description": "Collection of axolotl pictures and facts",
      "Auth": "",
      "HTTPS": true,
      "Cors": "no",
      "Link": "https://theaxolotlapi.netlify.app/",
      "Category": "Animals"
    }
  ]
}
```

Feel free to use any 3rd party library you are *familiar* with.