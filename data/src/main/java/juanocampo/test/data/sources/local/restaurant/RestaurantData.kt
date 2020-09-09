package juanocampo.test.data.sources.local.restaurant

import juanocampo.test.data.sources.local.entity.DataEntity

data class RestaurantData(
    override val id: String,
    val name: String?,
    val recipeIds: List<String>?,
    val location: String?
) : DataEntity