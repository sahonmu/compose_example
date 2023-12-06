package com.sahonmu.compose.ui.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sahonmu.compose.ui.theme.ExampleComposeTheme

@Composable
fun MainScreen(
    onComponentItemClick: (String) -> Unit
) {
    ExampleComposeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            RecyclerViewContent(onItemClick = { message ->
                onComponentItemClick.invoke(message)
            })
        }
    }
}


@Composable
fun RecyclerViewContent(onItemClick: ((String) -> Unit)? = null) {
    val components = mutableListOf<String>().apply {
        add("TEXT")
        add("BUTTON")
        add("VIEWPAGER")
        add("RECYCLERVIEW")
    }
//    val state = remember { components }
    LazyColumn {
        items(components) { item ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {
                        onItemClick?.invoke(item)
                    }
                    .height(50.dp)
                    .padding(horizontal = 16.dp, vertical = 5.dp),
//                contentAlignment = Alignment.TopCenter
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Gray),
                    text = item,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    ExampleComposeTheme {
        RecyclerViewContent()
    }
}
