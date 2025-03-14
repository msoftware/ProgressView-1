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

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.skydoves.balloon.balloon
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  private val customTagBalloon by balloon(TagBalloonFactory::class)
  private val customStarBalloon by balloon(StarBalloonFactory::class)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    progressView.setOnProgressChangeListener { progressView.labelText = "heart ${it.toInt()}%" }
    progressView1.setOnProgressChangeListener { progressView1.labelText = "star ${it.toInt()}%" }
    progressView2.setOnProgressChangeListener { progressView2.labelText = "achieve ${it.toInt()}%" }
    progressView3.setOnProgressChangeListener { progressView3.labelText = "score ${it.toInt()}/100" }
    progressView4.setOnProgressChangeListener { progressView4.labelText = "achieve ${it.toInt()}%" }
    progressView5.setOnProgressChangeListener { progressView5.labelText = "achieve ${it.toInt()}%" }

    progressView.setOnProgressClickListener {
      if (customTagBalloon.isShowing) {
        customTagBalloon.dismiss()
      } else {
        customTagBalloon.showAlignTop(progressView.highlightView)
      }
    }

    progressView1.setOnProgressClickListener {
      if (customStarBalloon.isShowing) {
        customStarBalloon.dismiss()
      } else {
        customStarBalloon.showAlignTop(progressView1.highlightView)
      }
    }

    button.setOnClickListener {
      progressView.progress += 15
      progressView1.progress += 10
      progressView2.progress += 25
      progressView3.progress += 10
      progressView4.progress += 5
      progressView5.progress += 15
    }
  }
}
