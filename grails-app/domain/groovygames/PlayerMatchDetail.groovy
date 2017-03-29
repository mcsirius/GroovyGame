package groovygames

class PlayerMatchDetail {

    long playerId
    List<Item> items
    int heroId

    static constraints = {
    }

    static hasMany = [items : Item]
}
