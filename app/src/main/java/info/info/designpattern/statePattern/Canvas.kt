package info.info.designpattern.statePattern

import info.info.designpattern.statePattern.interFace.ToolInterFace

class Canvas {
    var toolInterFace : ToolInterFace? = null

    fun mouseDown() {
        toolInterFace!!.mouseDown()
    }

    fun mouseUp() {
        toolInterFace!!.mouseUp()
    }
}