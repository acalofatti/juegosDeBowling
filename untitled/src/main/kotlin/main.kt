import domain.Game

fun main(args: Array<String>) {
    val game = Game()

    game.roll(1)
    game.roll(7)
    game.roll(1)
    game.roll(2)


    val score = game.score()

    println("tu puntaje es: $score")
}