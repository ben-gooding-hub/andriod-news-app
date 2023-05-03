package com.example.interviewtask.components.small

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.interviewtask.services.utils.getHumanReadableDate
import com.example.interviewtask.services.utils.uppercaseWords

@Composable
fun Title(title: String, modifier: Modifier = Modifier) {
    Text(
        text = uppercaseWords(title),
        fontSize = 40.sp,
        modifier = modifier
    )
}

@Composable
fun Subtitle(subtitle: String, modifier: Modifier = Modifier) {
    Text(
        text = uppercaseWords(subtitle),
        fontSize = 20.sp,
        modifier = modifier
    )
}

@Composable
fun DateText(rawDate: String, modifier: Modifier = Modifier) {
    Text(
        text = getHumanReadableDate(rawDate),
        modifier = modifier,
        color = Color.Gray
    )
}