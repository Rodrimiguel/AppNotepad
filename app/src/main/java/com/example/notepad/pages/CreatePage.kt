package com.example.notepad.pages

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.notepad.ui.theme.NotepadTheme

@Composable
fun CrearPage(modifier: Modifier = Modifier) {
    Text(
        text = "Crear Page",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun CrearPagePreview() {
    NotepadTheme {
        CrearPage()
    }
}