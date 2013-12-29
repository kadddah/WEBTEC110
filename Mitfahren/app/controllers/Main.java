package controllers;

import play.mvc.Controller;
import play.mvc.Result;


public class Main extends Controller{
	
	/**
	 * weiterleitung zu statischer Seite
	 * @return
	 */
	public static Result index(){
		return redirect("/assets/html/start.html");
	}
	


}
