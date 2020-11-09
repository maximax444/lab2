import ru.ifmo.se.pokemon.*;
public class Togekiss extends Togetic
{
	public Togekiss(String name, int lvl) {
		super(name, lvl);
		setStats(85, 50, 95, 120, 115, 80);
		setType(Type.FAIRY, Type.FLYING);
		setMove(new FireBlast(), new ShadowBall(), new Charm(), new Flamethrower());
	}
}
class Flamethrower extends SpecialMove {
	public Flamethrower() {
		super(Type.FIRE, 90, 1.0);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		if (Math.random() <= 0.1) {
			Effect.burn(p);
		}
	}
}