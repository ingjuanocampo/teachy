package juanocampo.test.data.di

import dagger.Module
import dagger.Provides
import juanocampo.test.data.RepositoryImpl
import juanocampo.test.data.mapper.DataMapper
import juanocampo.test.data.sources.local.LocalDataSource
import juanocampo.test.data.sources.RemoteDataSource
import juanocampo.test.domain.entity.DomainEntity
import juanocampo.test.domain.repository.Repository

@Module
class DataModule {

    @Provides
    fun providesRepository(localDataSource: LocalDataSource,
                           remoteDataSource: RemoteDataSource,
                           dataMapper: DataMapper
    ): Repository<DomainEntity> = RepositoryImpl(localDataSource, remoteDataSource, dataMapper)

}