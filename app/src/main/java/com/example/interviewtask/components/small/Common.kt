package com.example.interviewtask.components.small

import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
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

@Composable
fun Link(text: String, url: String, modifier: Modifier = Modifier) {
    val annotatedString = buildAnnotatedString {
        append(text)
        val startIndex = text.indexOf(url)
        val endIndex = startIndex + url.length
        addStyle(
            SpanStyle(
                color = Color.Blue,
                textDecoration = TextDecoration.Underline
            ),
            startIndex,
            endIndex
        )
        addStringAnnotation(
            tag = "URL",
            annotation = url,
            start = 0,
            end = text.length
        )

    }
    val uriHandler = LocalUriHandler.current
    ClickableText(
        modifier = modifier,
        text = annotatedString,
        onClick = {
            annotatedString
                .getStringAnnotations("URL", it, it)
                .firstOrNull()?.let { stringAnnotation ->
                    uriHandler.openUri(stringAnnotation.item)
                }
        }
    )
}