package controllers

import play.api.mvc._

object Application extends Controller {

  var deployThreshold = 3
  
  def index = Action {
    Ok(views.html.index())
  }

  def manifest = Action {
    Ok("Version: 1.0\nHardcoded: true").as("text/plain")
  }

  def healthcheck = Action {
    if (deployThreshold > 0) {
      deployThreshold -= 1
      InternalServerError("Not ready yet!")
    } else {
      Ok("OK").as("text/plain")
    }
  }

}