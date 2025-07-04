package com.davi.dev.blazebird.presentation.screen.flappy

sealed class FlappyGameUi {

    object NotStarted : FlappyGameUi()

    data class Playing(
        val bird: Bird,
        val obstacles: List<Obstacle> = emptyList(),
        val score: Int
    ) : FlappyGameUi()

    data class Finished(val finalScore: Int) : FlappyGameUi()
}

data class Bird(
    val sizeDp: Float,
    val rotation: Float,
    val verticalBias: Float
)

data class Obstacle(
    val widthDp: Float,
    val heightDp: Float,
    val topMargin: Float,
    val leftMargin: Float,
    val orientation: ObstaclePosition
)

enum class ObstaclePosition { Up, Down }

data class Scoreboard(
    val current: Int,
    val best: Int
)