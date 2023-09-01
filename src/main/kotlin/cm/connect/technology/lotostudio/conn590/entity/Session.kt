package cm.connect.technology.lotostudio.conn590.entity

import java.time.LocalDateTime
import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "SESSION")
class Session (
    @Id
    var idSession : Long = System.currentTimeMillis(),
    var StartDate: LocalDateTime = LocalDateTime.now(),
    var endDate: LocalDateTime = LocalDateTime.now(),
    var winnerNumbers:Int = 0,
    @Column(columnDefinition = "Double default 0")
    var revenue: Double = 0.0,
    @Column(columnDefinition = "Double default 0")
    var payout: Double = 0.0,
    @Column(columnDefinition = "varchar(100) default 'enter the status of the session'")
    var status : String = ""


        )
