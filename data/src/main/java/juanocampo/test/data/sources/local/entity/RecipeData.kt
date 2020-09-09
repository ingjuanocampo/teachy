package juanocampo.test.data.sources.local.entity

import java.util.*

data class RecipeData(
    override val id: String = "REC-${UUID.randomUUID()}",
    val name: String,
    val ownerId: String?,
    val photo: String? = null,
    val categoryId: String? = null,
    val links: String? = null,
    val steps: String?= null,
    val ingredients: String?= null,
    val location: String?= null
): DataEntity