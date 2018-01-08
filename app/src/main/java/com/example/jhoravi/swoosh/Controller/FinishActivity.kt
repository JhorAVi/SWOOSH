package com.example.jhoravi.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.jhoravi.swoosh.R
import com.example.jhoravi.swoosh.Utilities.EXTRA_LEAGUE
import com.example.jhoravi.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "Looking for a $league $skill league near you..."

       // println("finish testing "+ league)
    }
}
