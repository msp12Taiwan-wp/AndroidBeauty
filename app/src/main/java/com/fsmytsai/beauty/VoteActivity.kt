package com.fsmytsai.beauty

import android.annotation.TargetApi
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout

class VoteActivity : AppCompatActivity() {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vote)

        val imageView = ImageView(this)
        imageView.setImageResource(R.drawable.i1)
        imageView.adjustViewBounds = true
        imageView.transitionName = "test"
        val layoutParams  = RelativeLayout.LayoutParams(500, RelativeLayout.LayoutParams.WRAP_CONTENT)
        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT,RelativeLayout.TRUE)
        imageView.layoutParams = layoutParams

        findViewById<RelativeLayout>(R.id.rl_root).addView(imageView)
    }
}
