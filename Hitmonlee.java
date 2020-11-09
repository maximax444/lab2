import ru.ifmo.se.pokemon.*;
public class Hitmonlee extends Tyrogue
{
	public Hitmonlee(String name, int lvl) {
		super(name, lvl);
		setStats(50, 120, 53, 35, 110, 87);
		setType(Type.FIGHTING);
		setMove(new Swagger(), new Confide(), new BulkUp(), new FocusEnergy());
	}
}

class FocusEnergy extends StatusMove {
	public FocusEnergy() {
		super(Type.NORMAL, 0, 0);
	}
	@Override
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.SPECIAL_ATTACK, 2);
	}
}