package com.android.mirror.tv

object WorkoutMockList {
    val CLASSES = arrayOf(
        "Boxing",
        "Cardio",
        "Strength",
        "Meditation"
    )

    val LIST: List<WorkoutVideo> by lazy {
        setupClasses()
    }
    private var count: Long = 0

    private fun setupClasses(): List<WorkoutVideo> {
        val title = arrayOf(
            "Strength: Butt + Legs",
            "Strength: Arms",
            "Yoga Flow: Full Body",
            "Restorative Yoga",
            "Strength: Chest, Back + Abs"
        )

        val bgImageUrl = arrayOf(
            "https://commonsware.com/misc/curiouser/trainer.png",
            "https://imageio.forbes.com/specials-images/imageserve/620aebda31118c42adbf109c/best-fitness-mirrors--proform/0x0.jpg?fit=crop&format=jpg&crop=1355,1015,x293,y0,safe",
            "https://commonsware.com/misc/curiouser/trainer.png",
            "https://www.docwirenews.com/wp-content/uploads/2018/09/mirror-male_phone_0172_r3.jpg",
            "https://imageio.forbes.com/specials-images/imageserve/620aebda31118c42adbf109c/best-fitness-mirrors--proform/0x0.jpg?fit=crop&format=jpg&crop=1355,1015,x293,y0,safe"
        )
        val cardImageUrl = arrayOf(
            "https://commonsware.com/misc/curiouser/trainer.png",
            "https://commonsware.com/misc/curiouser/trainer.png",
            "https://commonsware.com/misc/curiouser/trainer.png",
            "https://commonsware.com/misc/curiouser/trainer.png",
            "https://commonsware.com/misc/curiouser/trainer.png"
        )

        val list = title.indices.map {
            buildWorkoutInfoo(
                title[it],
                cardImageUrl[it],
                bgImageUrl[it]
            )
        }

        return list
    }

    private fun buildWorkoutInfoo(
        title: String,
        cardImageUrl: String,
        backgroundImageUrl: String
    ): WorkoutVideo {
        val workout = WorkoutVideo()
        workout.id = count++
        workout.title = title
        workout.cardImageUrl = cardImageUrl
        workout.backgroundImageUrl = backgroundImageUrl
        return workout
    }
}