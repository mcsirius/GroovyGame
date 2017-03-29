package groovygames

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient
import com.amazonaws.services.dynamodbv2.model.ListTablesResult

class MatchHistoryController {

    AmazonDynamoDBAsyncClient dynamoClient

    def index() {

    }

    def details() {

        ListTablesResult result = dynamoClient.listTables()

        println result.tableNames[0]
    }
}