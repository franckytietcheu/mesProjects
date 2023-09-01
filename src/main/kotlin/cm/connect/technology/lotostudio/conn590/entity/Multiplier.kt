package cm.connect.technology.lotostudio.conn590.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Multiplier (
    idGainProperty:Long,
    var number : Double ):GainProperty(idGainProperty)
