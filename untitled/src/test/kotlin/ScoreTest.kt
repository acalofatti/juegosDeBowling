package test



import application.Score
import org.junit.Test
import kotlin.test.assertEquals

class ScoreTest {

    private val score = Score()
    @Test
    fun `give a rolls when score invoke is called then obtain three point`(){
        var rolls: ArrayList<Int> = ArrayList()
        rolls.add(1)
        rolls.add(2)

        var scoreExpected = score.invoke(rolls)

        assertEquals(3, scoreExpected)
    }

    @Test
    fun `give a rolls with a strike when score is called then obtain ten point for strike more points for the next frame `(){
        var rolls: ArrayList<Int> = ArrayList()
        rolls.add(10)
        rolls.add(1)
        rolls.add(2)

        var scoreExpected = score.invoke(rolls)

        assertEquals(16, scoreExpected)
    }

    @Test
    fun `give a frame with a spire when score is called then obtain ten point for strike more points for the next frame `(){
        var rolls: ArrayList<Int> = ArrayList()
        rolls.add(5)
        rolls.add(5)
        rolls.add(1)
        rolls.add(2)

        var scoreExpected = score.invoke(rolls)

        assertEquals(14, scoreExpected)
    }
}