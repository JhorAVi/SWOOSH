package com.example.jhoravi.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.jhoravi.swoosh.Utilities.EXTRA_LEAGUE
import com.example.jhoravi.swoosh.R
import com.example.jhoravi.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)

       // println("skill testing $league")
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }


    fun onFinishClicked(view: View){
        if (skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
          //  println("Testing Print this one more $league")
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a Skill", Toast.LENGTH_SHORT).show()
        }

    }
}
