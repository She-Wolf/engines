package controllers;

import models.*;
import play.data.*;
import play.libs.Json;
import play.mvc.*;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class Engines extends Controller {

	public static Result getenginesbycat() {
		ObjectNode result = Json.newObject();
		result.put("status", "OK");
		DynamicForm data = Form.form().bindFromRequest();
		Integer cat = Integer.valueOf(data.get("param"));
		result.put("objects", Json.toJson(Engine.get(cat)));
		return ok(result);
	}
	
	public static Result getenginesbyacc() {
		ObjectNode result = Json.newObject();
		result.put("status", "OK");
		DynamicForm data = Form.form().bindFromRequest();
		Long acc = Long.valueOf(data.get("param"));
		result.put("objects", Json.toJson(Matcher.enginesByAcc(acc)));
		return ok(result);
	}
	
	public static Result getaccsforengine() {
		ObjectNode result = Json.newObject();
		result.put("status", "OK");
		DynamicForm data = Form.form().bindFromRequest();
		Long engine = Long.valueOf(data.get("param"));
		result.put("objects", Json.toJson(Matcher.accsForEngine(engine)));
		return ok(result);
	}
}
