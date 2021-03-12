package info.info.strategypattern.strategyPattern.example2.gender

import android.util.Log

class Male : Gender {
    override fun gender(name: String) {
        Log.e("gender","is Male")
    }
}