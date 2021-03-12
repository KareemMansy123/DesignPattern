package info.info.momentopattern.momentoPattern

class History {
    var list = ArrayList<EditorState>()

    fun push(editorState: EditorState) {
        list.add(editorState)
    }

    fun pop(): EditorState {
        val lastIndex = list.size - 1
        val lastState = list[lastIndex]
        list.remove(lastState)
        return lastState
    }
}