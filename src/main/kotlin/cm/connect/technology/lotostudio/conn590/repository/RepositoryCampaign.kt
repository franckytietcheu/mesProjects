package cm.connect.technology.lotostudio.conn590.repository

import cm.connect.technology.lotostudio.conn590.entity.Campaign
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RepositoryCampaign:JpaRepository<Campaign,String> {
}