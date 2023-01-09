package application

import Score.persistence.LoadedScore
import Score.persistence.LoadedScoreImpl
import service.FunctionLoadedFrameService

class Score {

    private var loadedScore : LoadedScore = LoadedScoreImpl()
    private val functionLoadedFrameService = FunctionLoadedFrameService()

    operator fun invoke(rolls : ArrayList<Int>) : Int {
        var frames = functionLoadedFrameService.createFrames(rolls)
        return loadedScore.calculateScore(frames)
    }
}