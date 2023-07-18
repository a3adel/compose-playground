package com.example.homeincompose.data

fun provideHomeHeaderImages() = listOf(
    HomeHeader(
        "https://api.slingacademy.com/public/sample-photos/3.jpeg",
        1
    ),
    HomeHeader(
        "https://api.slingacademy.com/public/sample-photos/2.jpeg",
        2
    ),
    HomeHeader(
        "https://api.slingacademy.com/public/sample-photos/1.jpeg",
        3
    )
)

fun getFeedTypes() = listOf(
    FeedTypes("https://beta-upload.la3eb.com/profile/default-avatars/neon-07.png", 1),
    FeedTypes(
        "https://beta-m2.la3eb.com/media/social/channel/icon/1/5/1589210387.png",
        3,
        isSelected = true
    ),
    FeedTypes("https://beta-m2.la3eb.com/media/social/channel/icon/1/6/1600075035.png", 4),
    FeedTypes("https://beta-m2.la3eb.com/media/social/channel/icon/1/5/1589185498.png", 5),
    FeedTypes("https://beta-m2.la3eb.com/media/social/channel/icon/1/6/1614665010.png", 6),
    FeedTypes("https://beta-m2.la3eb.com/media/social/channel/icon/1/6/1609751922.png", 7),
    FeedTypes("https://beta-m2.la3eb.com/media/social/channel/icon/1/5/1593516628.png", 8),
    FeedTypes("https://beta-upload.la3eb.com/profile/default-avatars/neon-07.png", 9),
    FeedTypes("https://beta-m2.la3eb.com/media/social/channel/icon/1/6/1609751922.png", 11),
    FeedTypes("https://beta-m2.la3eb.com/media/social/channel/icon/1/5/1589185498.png", 12),

    FeedTypes("https://beta-m2.la3eb.com/media/social/channel/icon/1/6/1647429107.png", 10),

    )

fun getPosts() = listOf(
    UserFeedView.Post(
        "Anter",
        "https://upload.la3eb.com/profile/ec70e7dd-61d6-4ea3-aee7-25cd3808b4f3/avatar/1682838987843.png",
        "La3ebhub",
        "this is bla bla content",
        imageUrl = "https://upload.la3eb.com/profile/ec70e7dd-61d6-4ea3-aee7-25cd3808b4f3/avatar/1682838987843.png",
        date = "1 day ago"
    ),

    UserFeedView.Post(
        "Khaled",
        "https://upload.la3eb.com/profile/ec70e7dd-61d6-4ea3-aee7-25cd3808b4f3/avatar/1682838987843.png",
        "La3ebhub",
        "this is khaled content",
        imageUrl = "https://upload.la3eb.com/profile/ec70e7dd-61d6-4ea3-aee7-25cd3808b4f3/avatar/1682838987843.png",
        date = "1 day ago"
    ),
    UserFeedView.Post(
        "Anter",
        "https://upload.la3eb.com/profile/ec70e7dd-61d6-4ea3-aee7-25cd3808b4f3/avatar/1682838987843.png",
        "La3ebhub",
        "this is Anter content",
        imageUrl = "https://upload.la3eb.com/profile/ec70e7dd-61d6-4ea3-aee7-25cd3808b4f3/avatar/1682838987843.png",
        date = "1 day ago"
    ),

    UserFeedView.Post(
        "Dourkan",
        "https://upload.la3eb.com/profile/ec70e7dd-61d6-4ea3-aee7-25cd3808b4f3/avatar/1682838987843.png",
        "La3ebhub",
        "this is another content",
        imageUrl = null,
        date = "1 day ago"
    )
)

fun getTournaments() =
    listOf(
        UserFeedView.Tournament(
            "July Tournament",
            "https://api.slingacademy.com/public/sample-photos/2.jpeg"
        ),
        UserFeedView.Tournament(
            "August Tournament",
            "https://api.slingacademy.com/public/sample-photos/1.jpeg"
        )
    )
