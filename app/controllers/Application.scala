package controllers

import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }

  def manifest = Action {
    Ok("Version: 1.0\nHardcoded: true").as("text/plain")
  }

  def healthcheck = Action {
    Ok("OK").as("text/plain")
  }

}