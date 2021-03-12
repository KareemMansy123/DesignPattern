package info.info.strategypattern.strategyPattern.example1.filter

import android.util.Log

class BlackAndWhiteFilter : Filter {
    override fun apply(fileName: String) {
        Log.e("filtering","filtering B&W ....")
    }
}