package info.info.momentopattern.momentoPattern

class Editor {
    var content: String = ""

    fun createState(): EditorState {
        return EditorState(content)
    }

    fun restore(state: EditorState) {
        content = state.content!!
    }

    fun gotContent(): String {
        return content
    }
}