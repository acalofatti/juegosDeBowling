package Score.service

import Score.persistence.ValidateIntegrityFrame
import Score.persistence.ValidateIntegrityFrameImpl

class ValidateIntegrityFrameService {

    private var validateIntegrityFrame : ValidateIntegrityFrame = ValidateIntegrityFrameImpl()

    fun validateAmountPins(roll: Int) {
        validateIntegrityFrame.validateAmountPins(roll)
    }

    fun validateSumOfPins(rollOne: Int, rollTwo: Int) {
        validateIntegrityFrame.validateSumOfPins(rollOne, rollTwo)
    }
}