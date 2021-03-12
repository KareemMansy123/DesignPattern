package info.info.strategypattern.strategyPattern.example2.Nationality

import android.util.Log

class Germany : Nationality {
    override fun nationality(name: String) {
        Log.e("nationality","Germany....")
    }
}