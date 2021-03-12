package info.info.strategypattern.strategyPattern.example1.compressor

import android.util.Log

class CompressingJPEG : Compressor {
    override fun compress(fileName: String) {
        Log.e("Compressor","Compressing JPEG ....")
    }
}