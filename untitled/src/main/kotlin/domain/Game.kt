package domain
import exceptions.AmountRollsIsFull
import provider.Provider

class Game {

    private val provider = Provider()
    var rolls = ArrayList<Int>()

    fun roll(pins : Int){
        validateMaximumNumberOfRollsAllowed(rolls.size)
        rolls.add(pins)
    }

    fun score() : Int {
        return provider.score()(rolls)
    }

    private fun validateMaximumNumberOfRollsAllowed(rollsSize : Int){
        if(rollsSize >= 21) throw AmountRollsIsFull()
    }
}