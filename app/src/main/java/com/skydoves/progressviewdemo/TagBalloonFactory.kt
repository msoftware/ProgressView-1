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

package com.skydoves.progressviewdemo

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import com.skydoves.balloon.ArrowOrientation
import com.skydoves.balloon.Balloon
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.createBalloon

class TagBalloonFactory : Balloon.Factory() {

  override fun create(context: Context, lifecycle: LifecycleOwner): Balloon {
    return createBalloon(context) {
      setLayout(R.layout.layout_custom_tag)
      setArrowSize(10)
      setArrowOrientation(ArrowOrientation.BOTTOM)
      setArrowPosition(0.5f)
      setWidth(90)
      setHeight(60)
      setCornerRadius(4f)
      setBackgroundColor(ContextCompat.getColor(context, R.color.white))
      setBalloonAnimation(BalloonAnimation.ELASTIC)
      setLifecycleOwner(lifecycle)
    }
  }
}
