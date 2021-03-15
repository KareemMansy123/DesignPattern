package info.info.designpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import info.info.designpattern.statePattern.BrushTool
import info.info.designpattern.statePattern.Canvas
import info.info.designpattern.statePattern.SelectionTool
import info.info.designpattern.statePattern.interFace.ToolInterFace
import info.info.momentopattern.momentoPattern.Editor
import info.info.momentopattern.momentoPattern.History
import info.info.strategypattern.strategyPattern.example1.ImageStorage
import info.info.strategypattern.strategyPattern.example1.compressor.CompressingJPEG
import info.info.strategypattern.strategyPattern.example1.filter.BlackAndWhiteFilter
import info.info.strategypattern.strategyPattern.example2.Nationality.Egyption
import info.info.strategypattern.strategyPattern.example2.UsersStore
import info.info.strategypattern.strategyPattern.example2.gender.Male

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mementoPattern()

//        strategyPatterEx1()

//        strategyPatterEx2()

        statePattern()
    }

    private fun mementoPattern() {
        val editor = Editor()
        val history = History()
        editor.content = "a"
        history.push(editor.createState())
        editor.content = "b"
        history.push(editor.createState())
        editor.content = "c"
        editor.restore(history.pop())

        Log.e("content", editor.gotContent())
    }

    private fun strategyPatterEx1() {
        val imageStorage = ImageStorage()
        imageStorage.store("a", CompressingJPEG(), BlackAndWhiteFilter())
    }

    private fun strategyPatterEx2() {
        val usersStore = UsersStore()
        usersStore.store("Mansy", Male(), Egyption())
    }

    private fun statePattern() {
        val canvas = Canvas()
        canvas.toolInterFace = BrushTool()
        canvas.mouseDown()
        canvas.mouseUp()
    }

}