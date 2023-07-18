package com.example.homeincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.homeincompose.data.FeedTypes
import com.example.homeincompose.data.HomeHeader
import com.example.homeincompose.data.getFeedTypes
import com.example.homeincompose.data.provideHomeHeaderImages
import com.example.homeincompose.home_screen.BuildUserFeedView
import com.example.homeincompose.ui.theme.HomeInComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeInComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LazyColumn(Modifier.background(color = Color.Black)) {

                        item { generateHeader(headerImages = provideHomeHeaderImages()) }
                        item { generateUserGreeting(userName = "Adel") }
                        item { createFeedsList(feedsList = getFeedTypes()) }
                        item { BuildUserFeedView() }
                    }
                }
            }
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun generateHeader(headerImages: List<HomeHeader>) {
    HorizontalPager(
        pageCount = headerImages.size,
        key = { headerImages[it] }
    ) { index ->

        AsyncImage(
            model = headerImages[index].url,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun generateUserGreeting(userName: String) {
    Column(
        modifier = Modifier
            .background(color = Color.Black)
            .fillMaxWidth()
    ) {


        Text(
            text = "Hi $userName", color = Color.White, modifier = Modifier.padding(5.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Welcome back. see whats up in the gaming world today!",
            color = Color.White,
            modifier = Modifier.padding(5.dp)
        )
    }
}

@Composable
fun createFeedsList(feedsList: List<FeedTypes>) {
    LazyRow(
        modifier = Modifier
            .background(Color.LightGray)
            .padding(5.dp),

        ) {
        for (item in feedsList)
            item {
                if (item.isSelected)
                    AsyncImage(
                        modifier = Modifier
                            .width(46.dp)
                            .height(46.dp)
                            .padding(horizontal = 5.dp)
                            .border(width = 1.dp, color = Color.Yellow)
                            .clip(RoundedCornerShape(10.dp)),
                        model = item.url, contentDescription = null
                    )
                else
                    AsyncImage(
                        modifier = Modifier
                            .width(46.dp)
                            .height(46.dp)
                            .padding(horizontal = 5.dp)
                            .clip(RoundedCornerShape(10.dp)),
                        model = item.url, contentDescription = null
                    )
            }
    }
}

