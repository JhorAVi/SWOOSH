package com.example.jhoravi.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println("Just to test of the league value is successfully passed")
    }
}
