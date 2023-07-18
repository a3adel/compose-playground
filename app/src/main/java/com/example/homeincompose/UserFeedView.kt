package com.example.homeincompose

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.homeincompose.data.getPosts
import com.example.homeincompose.data.getTournaments

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BuildUserFeedView() {

    Column() {
        Text(
            text = "Share Something with community",
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .background(Color.Black)
                .border(width = 1.dp, color = Color.White, shape = RoundedCornerShape(10))
                .padding(10.dp)

                .clip(RoundedCornerShape(10.dp)),
            color = Color.White
        )

        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Hot",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
            Text(
                text = "Fresh", color = Color.DarkGray, fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center

            )

        }

        HorizontalPager(pageCount = 2, modifier = Modifier.fillMaxHeight()) { index ->
            if (index == 0)
                Column {
                    for (post in getPosts()) {
                        buildPostView(post)
                        Divider(
                            color = Color.Gray,
                            thickness = 1.dp,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Text(
                        text = "Recomended Tournaments",
                        color = Color.White,
                        fontWeight = Bold,
                        modifier = Modifier.padding(10.dp)
                    )
                    LazyRow {
                        for (tournament in getTournaments()) {
                           item{ buildTournamentView(tournament = tournament)}
                        }
                    }
                }
            else {
                Text(
                    text = "Other screen",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }

}