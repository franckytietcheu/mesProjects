package cm.connect.technology.lotostudio.conn590.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "GAINPROPERTY")
 open class GainProperty (
    @Id
    var idGainProperty:Long=System.currentTimeMillis()
        )
