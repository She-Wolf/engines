package models;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Expr;

import play.db.ebean.Model;

@Entity
public class Engine extends Model {
	@Id
	public Long id;
	@NotNull @ManyToOne
	public Category category; // Тип двигателя
	@NotNull
	public String name; // Название
	@NotNull
	public String power; // Мощность, кВт / л.с.
	@NotNull
	public Integer RPM; // Макс. обороты, об/мин
	@NotNull
	public Integer weight; // Вес, кг
	@NotNull
	public String dimensions; // Габариты, ШхДхВ, мм
	@NotNull
	public String gear_ratio; // Передаточные числа редуктора
	@NotNull
	public String imglink; // Ссылка на изображение
	
	private static Finder<Long, Engine> find = new Finder<Long, Engine>(Long.class, Engine.class);
	
	public static Engine byName(String name) {
		List<Engine> engine = find.where(Expr.ieq("name", name)).findList();
		if(engine.isEmpty()) return null; else return engine.get(0);
	}
	
	public static List<Engine> get(Integer cat) {
		return find.where(Expr.eq("category_id", cat)).findList();
	}
}
