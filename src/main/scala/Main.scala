import scalafx.application.JFXApp3
import scalafx.scene.Scene
import scalafx.scene.layout.BorderPane

object Main extends JFXApp3:
  def start(): Unit =
    stage = new JFXApp3.PrimaryStage:
      title.value = "Fileditor"
      width = 700
      height = 800
      resizable = false

      scene = new Scene:
        root = new BorderPane