package cm.connect.technology.lotostudio.conn590.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import java.util.Date
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "CAMPAIGN")
class Campaign (
    @Id
    var idCampaign :Long=System.currentTimeMillis(),
    @ManyToOne @JoinColumn(name = "idCampaign")
    var idSession :ArrayList<Long > = arrayListOf(),
    @Column(columnDefinition = "Double default 0.0")
    var minBet : Double=0.0,
    @Column(columnDefinition = "Double default 0.0")
    var maxBet : Double=0.0,
    var creationDate:LocalDateTime=LocalDateTime.now(),
    var startDate : LocalDateTime= LocalDateTime.now(),
    var endDate:LocalDateTime = LocalDateTime.now(),
    @Column(columnDefinition = "varchar(100) default 'vide'")
    var Status : String= "",
    @Column(columnDefinition = "Integer default 0")
    var time : Int = 0,
    @Column(columnDefinition = "varchar(100) default 'please enter the name of campaign'")
    var name : String =""

     )
