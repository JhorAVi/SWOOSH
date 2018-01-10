package com.example.jhoravi.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.jhoravi.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
     }

    fun getStartedClicked(view: View){
        val leagueActivity = Intent(this, LeagueActivity::class.java)
        startActivity(leagueActivity)
    }
}
