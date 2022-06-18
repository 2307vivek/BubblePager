/*
 * MIT License
 *
 * Copyright (c) 2022 Vivek Singh
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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
