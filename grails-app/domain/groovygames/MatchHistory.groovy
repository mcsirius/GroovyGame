package groovygames

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable

@DynamoDBTable(tableName = "match_history")
class MatchHistory {

    @DynamoDBHashKey(attributeName = "match_id")
    long matchId

    @DynamoDBAttribute(attributeName = "match_seq_number")
    long matchSeqNum
//    long startTime
//    int lobbyType
//    List<Player> players

    static constraints = {
    }

   // static hasMany = [players : Player]
}
