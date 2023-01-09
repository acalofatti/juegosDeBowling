package Score.persistence

import Score.domain.Frame

interface LoadedScore {
    fun calculateScore(frames: ArrayList<Frame>) : Int
}