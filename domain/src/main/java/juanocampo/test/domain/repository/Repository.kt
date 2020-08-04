package juanocampo.test.domain.repository

import juanocampo.test.domain.entity.DomainEntity

interface Repository {

    fun save()

    fun load(): DomainEntity?
}