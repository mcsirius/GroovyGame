package groovygames

class MatchHistory {

    long matchId
    long matchSeqNum
    long startTime
    int lobbyType
    List<Player> players

    static constraints = {
    }

    static hasMany = [players : Player]
}
