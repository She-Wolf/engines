package models;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Expr;

import play.db.ebean.Model;

@Entity
public class Accessory extends Model {
	@Id
	public Long id;
	@NotNull
	public String name; // Название
	@NotNull
	public String SKU; // Артикул
	@NotNull
	public String URL; // Ссылка
	
	private static Finder<Long, Accessory> find = new Finder<Long, Accessory>(Long.class, Accessory.class);
	
	public static Accessory bySKU(String SKU) {
		List<Accessory> acc = find.where(Expr.ieq("sku", SKU)).findList();
		if(acc.isEmpty()) return null; else return acc.get(0);
	}
}
