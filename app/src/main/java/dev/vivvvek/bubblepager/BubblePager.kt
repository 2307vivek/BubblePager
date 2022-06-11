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

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.unit.Dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerScope
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun BubblePager(
    state: PagerState,
    pageCount: Int,
    modifier: Modifier = Modifier,
    bubbleMinRadius: Dp,
    bubbleMaxRadius: Dp,
    bubbleBottomPadding: Dp,
    content: @Composable PagerScope.(Int) -> Unit
) {
    Box(modifier = modifier) {
        HorizontalPager(
            count = pageCount,
            state = state,
            modifier = modifier.drawBehind {
                drawRect(
                    color = Color.Red,
                    size = size
                )
                drawBubble(bubbleMinRadius, bubbleMaxRadius, bubbleBottomPadding)
            }
        ) { page ->
            content(page)
        }
    }
}

fun DrawScope.drawBubble(
    bubbleMinRadius: Dp,
    bubbleMaxRadius: Dp,
    bubbleBottomPadding: Dp
) {
    translate(size.width / 2) {
        drawCircle(
            color = Color.Blue,
            radius = bubbleMinRadius.toPx(),
            center = Offset(0f, size.height - bubbleBottomPadding.toPx())
        )
    }
}
