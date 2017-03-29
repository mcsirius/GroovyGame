package groovygames

class MatchDetail {

    long matchId
    long playerId
    List<PlayerMatchDetail> details

    static constraints = {
    }

    static hasMany = [details : PlayerMatchDetail]
}
