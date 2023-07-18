package com.example.homeincompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.homeincompose.data.UserFeedView

@Composable
fun buildPostView(post: UserFeedView.Post) {
    Column() {


        Row(
            modifier = Modifier
                .padding(10.dp, 10.dp, 10.dp)

                .height(50.dp)
                .fillMaxWidth()
        ) {
            AsyncImage(
                model = post.userImageUrl,
                contentDescription = null,
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(5.dp)
            ) {
                Text(text = post.userName, color = Color.Green)
                if (post.feedType != null)
                    Text(text = post.feedType, color = Color.Yellow)
            }
            Spacer(modifier = Modifier.weight(1f))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    contentDescription = null,
                    painter = painterResource(id = R.drawable.ic_user_settings)
                )

                Icon(
                    painter = painterResource(id = R.drawable.ic_following_new),
                    contentDescription = null
                )
            }
        }
        if (post.content != null) {
            Text(text = post.content, color = Color.White, modifier = Modifier.padding(10.dp))
        }
        if (post.imageUrl != null) {
            AsyncImage(
                model = post.imageUrl,
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}