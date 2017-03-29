import com.amazonaws.ClientConfiguration
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient
// Place your Spring DSL code here
beans = {

    dynamoClient(AmazonDynamoDBAsyncClient, ref('provider')) {
        endpoint="https://dynamodb.us-west-2.amazonaws.com"
    }


    provider(EnvironmentVariableCredentialsProvider) {

    }

    clientConfig(ClientConfiguration) {


    }

}
