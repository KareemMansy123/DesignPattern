package info.info.designpattern.statePattern

import android.util.Log
import info.info.designpattern.statePattern.interFace.ToolInterFace

class SelectionTool : ToolInterFace {
    override fun mouseDown() {
        Log.e("SelectionTool","Selection icon")
    }

    override fun mouseUp() {
        Log.e("SelectionTool","draw a dashed rectangle")
    }
}