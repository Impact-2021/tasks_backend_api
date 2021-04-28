**Allergen Finder APIs**
----
  Returns json data about a Restaurants, MenuItems, MenuItemAllergens.

* **URL**

  https://u6mq1fk1jg.execute-api.eu-west-2.amazonaws.com/dev/restaurants
  
  https://u6mq1fk1jg.execute-api.eu-west-2.amazonaws.com/dev/menuitems
  
  https://u6mq1fk1jg.execute-api.eu-west-2.amazonaws.com/dev/allergens

* **Method:**

  `GET`
  
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
rest_id: 1,
rest_name: "Nandos",
rest_branch: "St.Albans",
allergen_safety: "If you have a food allergy or intolerance, it",
sys_creation_date: 1618358400000,
sys_update_date: 1618358400000,
user_id: 111,
application_id: "app001",
version_code: "v1"
}`
 
* **Error Response:**

  * **Code:** 403 Forbidden <br />
    **Content:** `{
message: "Missing Authentication Token"
}`

 
