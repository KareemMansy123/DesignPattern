package info.info.strategypattern.strategyPattern.example1

import info.info.strategypattern.strategyPattern.example1.compressor.Compressor
import info.info.strategypattern.strategyPattern.example1.filter.Filter

class ImageStorage() {
    //todo for store image
    // we need 1 to compress an image with different types like JPEG,PNG ,ATC....
    // for reduce image size
    // we need 2 add filters for this image

    fun store(fileName : String, compressor : Compressor, filter : Filter) {
        compressor.compress(fileName)
        filter.apply(fileName)
    }
}