package info.info.strategypattern.strategyPattern.example1.compressor

import android.util.Log

class CompressingPNG : Compressor {
    override fun compress(fileName: String) {
        Log.e("Compressor","Compressing PNG ....")
    }
}