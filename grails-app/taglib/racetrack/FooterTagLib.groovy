package racetrack

import java.text.SimpleDateFormat

class FooterTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def thisYear = {
        out << new SimpleDateFormat("yyyy").format(new Date())
    }

    def copyright = {attr, body ->
        out << attr.startYear + " - "
        out << thisYear() + " " + body()
    }
}
