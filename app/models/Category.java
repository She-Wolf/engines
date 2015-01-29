package models;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Expr;

import play.db.ebean.Model;

@Entity
public class Category extends Model {
	@Id
	public Integer id;
	@NotNull
	public String cat; // Мн. ч.
	@NotNull
	public String name; // Ед. ч.
	
	public Category(String cat, String name) { this.cat = cat; this.name = name; }
	
	private static Finder<Long, Category> find = new Finder<Long, Category>(Long.class, Category.class);
	
	public static List<Category> all() { return find.all(); }
	
	public static Category byName(String name) {
		List<Category> cat = find.where(Expr.ieq("name", name)).findList();
		if(cat.isEmpty()) return null; else return cat.get(0);
	}
	
	public static Category DIESEL() { return byName("Дизельный"); }
	public static Category PETROL() { return byName("Бензиновый"); }
}
