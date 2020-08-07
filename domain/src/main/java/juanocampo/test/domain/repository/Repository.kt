package juanocampo.test.domain.repository

import kotlinx.coroutines.flow.Flow

interface Repository<T> {

    fun synData()

    fun createOrUpdate(list: List<T>)

    fun createOrUpdate(list: T)

    fun getAll(): Flow<List<T>>

    fun getById(id : String): Flow<T>

}