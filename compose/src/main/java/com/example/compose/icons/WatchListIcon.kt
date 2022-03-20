package com.example.compose.icons

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.Gray20

@Composable
fun WatchListIcon(modifier: Modifier) {
    val color = MaterialTheme.colors.Gray20
    Canvas(
        modifier = modifier,
    ) {
        val path = Path()
        path.moveTo(x = size.width / 2, y = 0f)
        path.lineTo(x = size.width * 0.60f, y = size.height * 0.40f)
        path.lineTo(x = size.width, y = size.height * 0.40f)
        path.lineTo(x = size.width * 0.65f, y = size.height * 0.60f)
        path.lineTo(x = size.width * 0.85f, y = size.height)
        path.lineTo(x = size.width / 2 , y = size.height * 0.75f)
        path.lineTo(x = size.width * 0.15f, y = size.height)
        path.lineTo(x = size.width * 0.35f, y = size.height * 0.60f)
        path.lineTo(x = 0f, y = size.height * 0.40f)
        path.lineTo(x = size.width * 0.40f, y = size.height * 0.40f)
        path.close()
        drawPath(
            path = path,
            color = color,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWatchListIcon() {
    WatchListIcon(
        modifier = Modifier.size(24.dp)
    )
}
