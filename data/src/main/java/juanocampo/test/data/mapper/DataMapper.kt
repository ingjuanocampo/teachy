package juanocampo.test.data.mapper

import juanocampo.test.data.sources.local.model.DataEntity
import juanocampo.test.domain.entity.DomainEntity

interface DataMapper {

    fun map(domainEntity: DomainEntity): DataEntity

    fun map(dataEntity: DataEntity): DomainEntity


}