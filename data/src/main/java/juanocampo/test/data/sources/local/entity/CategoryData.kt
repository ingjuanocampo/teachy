package juanocampo.test.data.sources.local.entity

import java.util.*

data class CategoryData(val id: String = "CAT-${UUID.randomUUID()}", val name: String)