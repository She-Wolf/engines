package controllers;

import models.*;
import play.GlobalSettings;

public class Global extends GlobalSettings {
	public void onStart(play.Application app) {
		if(Category.all().isEmpty()) {
			new Category("Бензиновые", "Бензиновый").save();
			new Category("Дизельные", "Дизельный").save();
			addEngines();
			addAccs();
			addMatchers();
		}
	}
  
	public void addEngines() {
		Engine engine;
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D1-13 / MS15L, MS15A";
		engine.power = "9.0 / 12";
		engine.RPM = 3200;
		engine.weight = 113;
		engine.dimensions = "649x476x517";
		engine.gear_ratio = "2.14-1.95 / 2.63-1.95";
		engine.imglink = "d1-13_ms10a.jpg";
		engine.save();
		
//		engine = new Engine();
		
//		engine.save();
	}
	
	public void addAccs() {
		Accessory acc;
		acc = new Accessory();
		acc.name = "Масло VDS-2";
		acc.SKU = "1141628";
		acc.URL = "http://bmb-irk.ru/index.php/vegatables-2/equipment";
		acc.save();
		
//		acc = new Accessory();
		
//		acc.save();
	}
	
	public void addMatchers() {
		new Matcher(Accessory.byName("Масло VDS-2"), Engine.byName("D1-13 / MS15L, MS15A")).save();
		
	}
}