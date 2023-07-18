package com.example.homeincompose.home_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.homeincompose.data.UserFeedView

@Composable
fun buildTournamentView(tournament: UserFeedView.Tournament) {
    Column(
        modifier = Modifier
            .border(width = 1.dp, color = Color.Yellow)
            .clip(RoundedCornerShape(10.dp))
            .padding(40.dp),
    ) {
        AsyncImage(model = tournament.image, contentDescription = null)
        Text(text = tournament.name, color = Color.White, modifier = Modifier.padding(10.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow),
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End)
        ) {
            Text(text = "Join now", color = Color.White)
        }
    }

}