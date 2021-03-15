package info.info.designpattern.statePattern

import android.util.Log
import info.info.designpattern.statePattern.interFace.ToolInterFace

class BrushTool : ToolInterFace {
    override fun mouseDown() {
        Log.e("BrushTool","Selection Tool")
    }

    override fun mouseUp() {
        Log.e("BrushTool","Draw Line")
    }
}