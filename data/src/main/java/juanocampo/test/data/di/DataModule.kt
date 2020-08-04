package juanocampo.test.data.di

import dagger.Module
import dagger.Provides
import juanocampo.test.data.RepositoryImpl
import juanocampo.test.domain.repository.Repository

@Module
class DataModule {

    @Provides
    fun providesRepository(
    ): Repository = RepositoryImpl()



}