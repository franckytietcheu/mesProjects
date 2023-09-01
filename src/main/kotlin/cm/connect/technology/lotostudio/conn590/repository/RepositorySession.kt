package cm.connect.technology.lotostudio.conn590.repository

import cm.connect.technology.lotostudio.conn590.entity.Session
import org.springframework.data.jpa.repository.JpaRepository

interface RepositorySession : JpaRepository<Session,Long> {
}