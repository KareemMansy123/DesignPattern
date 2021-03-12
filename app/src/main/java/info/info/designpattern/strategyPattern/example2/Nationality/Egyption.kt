package info.info.strategypattern.strategyPattern.example2.Nationality

import android.util.Log

class Egyption : Nationality {
    override fun nationality(name: String) {
        Log.e("nationality","Egyptian....")
    }
}