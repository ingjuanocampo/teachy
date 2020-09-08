package juanocampo.test.data.sources.local.entity

data class UserData(
    val id: String,
    val name: String?,
    val age: Int?,
    val email: String?,
    val picture: String?= null,
    val ownRecipesIds: String? = null,
    val ownRestaurantIds: String?= null,
    val recipesIds: String?= null,
    val restaurantIds: String?= null,
    val products: String?= null
)