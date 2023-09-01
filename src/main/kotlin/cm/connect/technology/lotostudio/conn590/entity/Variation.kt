package cm.connect.technology.lotostudio.conn590.entity

import java.time.LocalDateTime
import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name ="VARIATION")
class Variation(
    @Id
    var code : Long= System.currentTimeMillis(),
    @Column(columnDefinition = "varchar(100) default 'enter the description'")
    var description : String="",
    var createDate: LocalDateTime= LocalDateTime.now()

)
