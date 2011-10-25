package com.example

import unfiltered.request._
import unfiltered.response._
import unfiltered.filter.Plan
import unfiltered.scalate.Scalate

import org.clapper.avsl.Logger

class Hello extends Plan {
  val logger = Logger(classOf[App])

  def intent = {
    case req @ GET(Path("/hello")) => {
      Scalate(req, "hello-form.jade")
    }
    case req @ POST(Path("/hello") & Params(params)) => {
      val name = params("name").headOption.getOrElse("Unfiltered")
      Scalate(req, "hello.jade", ("name" -> name))
    }
  }
}

object Server extends App {
  unfiltered.jetty.Http.anylocal.plan(new Hello).run { s =>
    unfiltered.util.Browser.open( "http://127.0.0.1:%d/hello".format(s.port))
  }   
}

