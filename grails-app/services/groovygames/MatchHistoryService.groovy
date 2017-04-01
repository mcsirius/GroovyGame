package groovygames

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList
import grails.transaction.Transactional

@Transactional
class MatchHistoryService {

    def dynamoClient

    def retrieve(String playerId) {
        DynamoDBMapper mapper = new DynamoDBMapper(dynamoClient)
        DynamoDBScanExpression scanExpression = new DynamoDBScanExpression()
        PaginatedScanList<MatchHistory> paginatedList = mapper.scan(MatchHistory.class, scanExpression)
        Iterator<MatchHistory> iterator = paginatedList.iterator()

        while (iterator.hasNext()) {
            MatchHistory history = iterator.next()
            print(history.toString())
        }

    }
}
