package Score.persistence

import Score.domain.Frame

interface LoadedFrame {
    fun createFrame(rolls: Int, indexRolls: Int): Frame
}