package dev.vivvvek.bubblepager

import androidx.compose.ui.graphics.Color

val pages = listOf(
    Page(
        id = 1,
        content = PageContent(R.drawable.ic_interests, "Choose your interests"),
        color = Color(0xFF103E85)
    ),
    Page(
        id = 2,
        content = PageContent(R.drawable.ic_local_stories, "Local news stories"),
        color = Color(0xFFD45D9E)
    ),
    Page(
        id = 3,
        content = PageContent(R.drawable.ic_save_stories, "Save news stories"),
        color = Color(0xFFFFFFFF)
    ),
    Page(
        id = 4,
        content = PageContent(R.drawable.ic_bookmark_interests, "Bookmark your interests"),
        color = Color(0xFF52C6DF)
    ),
)

data class Page(
    val id: Int,
    val content: PageContent,
    val color: Color
)

data class PageContent(
    val imageId: Int,
    val text: String
)