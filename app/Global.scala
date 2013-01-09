import play.{Application, GlobalSettings}

class Global extends GlobalSettings {
  override def beforeStart(app: Application) {
    Thread.sleep(10000)
  }
}
