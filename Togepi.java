import ru.ifmo.se.pokemon.*;
public class Togepi extends Pokemon
{
	public Togepi(String name, int lvl) {
		super(name, lvl);
		setStats(35, 20, 65, 40, 65, 20);
		setType(Type.FAIRY);
		setMove(new FireBlast(), new ShadowBall());
	}
}

class FireBlast extends SpecialMove {
	public FireBlast() {
		super(Type.FIRE, 110, 0.85);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		if (Math.random() <= 0.1) {
			Effect.burn(p);
		}
	}
}
class ShadowBall extends SpecialMove {
	public ShadowBall() {
		super(Type.GHOST, 80, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		if (Math.random() <= 0.2){
			p.setMod(Stat.SPECIAL_DEFENSE, -1);
		}
	}
}
