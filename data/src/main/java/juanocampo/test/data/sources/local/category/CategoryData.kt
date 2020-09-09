package juanocampo.test.data.sources.local.category

import juanocampo.test.data.sources.local.entity.DataEntity
import java.util.*

data class CategoryData(override val id: String = "CAT-${UUID.randomUUID()}", val name: String): DataEntity