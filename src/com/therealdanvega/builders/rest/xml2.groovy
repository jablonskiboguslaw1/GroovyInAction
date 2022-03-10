import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('data/sports.xml')
MarkupBuilder mb = new MarkupBuilder(writer)
mb.doubleQuotes = true


mb.sports {
    sport(id: 1) {
        name "baseball"
    }
    sport(id: 2) {
        names {
            {
                UKname "football"
            }
            {
                USname "soccer"
            }
        }
    }
    sport(id: 3) {
        name "basketball"
    }
    sport(id: 4) {
        name "hockey"
    }

}