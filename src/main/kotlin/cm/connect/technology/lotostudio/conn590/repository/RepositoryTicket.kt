package cm.connect.technology.lotostudio.conn590.repository

import cm.connect.technology.lotostudio.conn590.entity.Ticket
import org.springframework.data.jpa.repository.JpaRepository

interface RepositoryTicket:JpaRepository<Ticket,Long> {
}