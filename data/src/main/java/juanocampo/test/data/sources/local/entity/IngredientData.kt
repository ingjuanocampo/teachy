package juanocampo.test.data.sources.local.entity

import java.util.*

class IngredientData(
    val id: String = "ING-${UUID.randomUUID()}",
    val title: String,
    val desc: String? = null,
    val pic: String? = null
)