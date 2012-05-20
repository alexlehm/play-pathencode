package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import org.apache.commons.codec.binary.Hex;

public class Application extends Controller {

  public static void index() {
    render();
  }

  public static void link(String name) {
    render(name);
  }

  public static void echo(String name) {
//    String hex=Hex.encodeHexString(name.getBytes());
//    render(hex);
    render(name);
  }

}
