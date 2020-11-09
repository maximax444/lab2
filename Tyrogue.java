import ru.ifmo.se.pokemon.*;
public class Tyrogue extends Pokemon
{
	public Tyrogue(String name, int lvl) {
		super(name, lvl);
		setStats(35, 35, 35, 35, 35, 35);
		setType(Type.FIGHTING);
		setMove(new Swagger(), new Confide(), new BulkUp());
	}
}

class Swagger extends StatusMove {
	public Swagger() {
		super(Type.NORMAL, 0, 0.85);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.ATTACK, 2);
		Effect.confuse(p);
	}
}
class Confide extends StatusMove {
	public Confide() {
		super(Type.NORMAL, 0, 0);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.SPECIAL_ATTACK, -1);
	}
}
class BulkUp extends StatusMove {
	public BulkUp() {
		super(Type.FIGHTING, 0, 0);
	}
	@Override
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.ATTACK, 1);
		p.setMod(Stat.DEFENSE, 1);
	}
}