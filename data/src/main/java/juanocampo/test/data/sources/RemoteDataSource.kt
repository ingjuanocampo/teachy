package juanocampo.test.data.sources

import juanocampo.test.data.sources.local.model.DataEntity

interface RemoteDataSource {

    fun fetchAll(): List<DataEntity>

    fun fetchById(id: String): DataEntity

}