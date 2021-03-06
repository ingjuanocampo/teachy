package juanocampo.test.data

import juanocampo.test.data.mapper.DataMapper
import juanocampo.test.data.sources.local.LocalDataSource
import juanocampo.test.data.sources.RemoteDataSource
import juanocampo.test.domain.entity.DomainEntity
import juanocampo.test.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class RepositoryImpl(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource,
    private val dataMapper: DataMapper): Repository<DomainEntity> {


    override fun synData() {
        val items = remoteDataSource.fetchAll()
        localDataSource.insertOrUpdate(items)
    }

    override fun createOrUpdate(list: List<DomainEntity>) {
        val items = list.map { dataMapper.map(it) }
        localDataSource.insertOrUpdate(items)
    }

    override fun createOrUpdate(item: DomainEntity) {
        localDataSource.insertOrUpdate(dataMapper.map(item))
    }

    override fun getAll(): Flow<List<DomainEntity>> {
        return localDataSource.getAll().map { it ->
            var localItems = it
            if (localItems.isNullOrEmpty()) {
                localItems = remoteDataSource.fetchAll()
                localDataSource.insertOrUpdate(localItems)
            }
            localItems.map { dataMapper.map(it) }
        }

    }

    override fun getById(id: String): Flow<DomainEntity> {
        return localDataSource.getById(id).map { it ->
            dataMapper.map(it)
        }
    }



}
