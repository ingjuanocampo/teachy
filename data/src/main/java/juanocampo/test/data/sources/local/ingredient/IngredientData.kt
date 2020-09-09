package juanocampo.test.data.sources.local.ingredient

import juanocampo.test.data.sources.local.entity.DataEntity
import java.util.*

class IngredientData(
    override val id: String = "ING-${UUID.randomUUID()}",
    val title: String,
    val desc: String? = null,
    val pic: String? = null
): DataEntity