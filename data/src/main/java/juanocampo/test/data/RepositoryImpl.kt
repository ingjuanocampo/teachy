package juanocampo.test.data

import juanocampo.test.domain.entity.DomainEntity
import juanocampo.test.domain.repository.Repository

internal class RepositoryImpl: Repository {

    override fun save() {
    }

    override fun load(): DomainEntity? {
        return null
    }
}