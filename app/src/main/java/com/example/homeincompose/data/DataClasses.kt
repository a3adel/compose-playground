package com.example.homeincompose.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HomeHeader(val url: String, val id: Int) : Parcelable

@Parcelize
data class FeedTypes(val url: String, val id: Int, val isSelected: Boolean = false) : Parcelable


@Parcelize
sealed class UserFeedView : Parcelable {
    class Post(
        val userName: String,
        val userImageUrl: String,
        val feedType: String?,
        val content: String?,
        val imageUrl: String?,
        val date: String?
    ) : UserFeedView()

    class Tournament(
        val name: String,
        val image: String
    ) : UserFeedView()

}