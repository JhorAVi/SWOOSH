package com.example.jhoravi.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.jhoravi.swoosh.Model.Player
import com.example.jhoravi.swoosh.R
import com.example.jhoravi.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for a ${player.league} ${player.skill} league near you..."

       // println("finish testing "+ league)
    }
}
