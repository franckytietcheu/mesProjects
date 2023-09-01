package cm.connect.technology.lotostudio.conn590.entity

import java.time.LocalDateTime
import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "TICKET")
class Ticket (
    @Id
    var idTicket: Long=System.currentTimeMillis(),
    var code :Long=System.currentTimeMillis(),
    @ManyToOne @JoinColumn(name = "idSession")
    var session: Session=Session(),
    @ManyToOne()@JoinColumn(name = "idGainProperty")
    var gainProperty: GainProperty=GainProperty(),
    var creationDate:LocalDateTime= LocalDateTime.now(),
    @Column(columnDefinition = "varchar(50) default 'enter the idUser '")
    var idUser:String = "",
    @Column(columnDefinition ="varchar(100) default 'enter the amount'" )
    var amount:String = "",
    @Column(columnDefinition = "integer default 0")
    var bet :Int =0,
    @Column(columnDefinition ="varchar(100) default 'enter the status'" )
    var status : String = ""

        )
