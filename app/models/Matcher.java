package models;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Expr;

import play.db.ebean.Model;

@Entity
public class Matcher extends Model {
	@Id
	private Long id;
	@NotNull @ManyToOne
	public Accessory acc; // Аксессуар
	@NotNull @ManyToOne
	public Engine engine; // Двигатель
	
	private static Finder<Long, Matcher> find = new Finder<Long, Matcher>(Long.class, Matcher.class);
	
	public Matcher(Accessory acc, Engine engine) {
		this.acc = acc; this.engine = engine;
	}
	
	public static List<Accessory> accsForEngine(Long engine_id) {
		List<Matcher> list = find.where(Expr.eq("engine_id", engine_id)).findList();
		List<Accessory> accs = new ArrayList<Accessory>();
		for(Matcher match: list) accs.add(match.acc);
		return accs;
	}
	
	public static List<Engine> enginesByAcc(Long acc_id) {
		List<Matcher> list = find.where(Expr.eq("acc_id", acc_id)).findList();
		List<Engine> engines = new ArrayList<Engine>();
		for(Matcher match: list) engines.add(match.engine);
		return engines;
	}
}
