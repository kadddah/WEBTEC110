package controllers;

import models.ValidUser;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;

public class Login extends Controller{

	public static Result showLogin(){
		
		return redirect("/assets/html/logged_in.html");
	}
	
	public static Result login(){
		Form<ValidUser> form = Form.form(ValidUser.class);
		form = form.bindFromRequest();

		if(form.hasErrors()){
			
			return badRequest("Fail!!! Fehler: " + form.errors());
		} else {
			ValidUser user = form.get();
			return ok("Das wurde eingegeben: " + user.email + " " + user.password);
		}
	}
}
