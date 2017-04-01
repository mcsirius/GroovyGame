package groovygames

class MatchHistoryController {


    def matchHistoryService

    def index() {

    }

    def details() {

        matchHistoryService.retrieve(params.playerId)

    }
}