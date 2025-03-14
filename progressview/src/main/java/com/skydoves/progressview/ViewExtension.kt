/*
 * Copyright (C) 2019 skydoves
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("UNCHECKED_CAST")

package com.skydoves.progressview

import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.content.ContextCompat

/** dp size to px size. */
internal fun View.dp2Px(dp: Int): Int {
  val scale = resources.displayMetrics.density
  return (dp * scale).toInt()
}

/** sp size to px size. */
internal fun View.sp2Px(sp: Float): Float {
  return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, context.resources.displayMetrics)
}

/** gets color from the ContextCompat. */
internal fun View.compatColor(color: Int): Int {
  return ContextCompat.getColor(context, color)
}

/** updates [FrameLayout] params. */
internal fun ViewGroup.updateLayoutParams(block: ViewGroup.LayoutParams.() -> Unit) {
  layoutParams?.let {
    val params: ViewGroup.LayoutParams = (layoutParams as ViewGroup.LayoutParams).apply { block(this) }
    layoutParams = params
  }
}
