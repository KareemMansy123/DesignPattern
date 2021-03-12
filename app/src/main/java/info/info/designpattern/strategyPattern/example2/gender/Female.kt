package info.info.strategypattern.strategyPattern.example2.gender

import android.util.Log

class Female : Gender {
    override fun gender(name: String) {
        Log.e("gender","is Female")
    }
}