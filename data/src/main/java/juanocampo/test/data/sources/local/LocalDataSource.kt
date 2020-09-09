package juanocampo.test.data.sources.local

import juanocampo.test.data.sources.local.entity.DataEntity
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {

    fun insertOrUpdate(list: DataEntity)
    fun insertOrUpdate(list: List<DataEntity>)
    fun getAll(): Flow<List<DataEntity>>
    fun getById(id: String): Flow<DataEntity>

}