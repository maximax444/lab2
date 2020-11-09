import ru.ifmo.se.pokemon.*;
public class Dunsparce extends Pokemon
{
	public Dunsparce(String name, int lvl) {
		super(name, lvl);
		setStats(100, 70, 70, 65, 65, 45);
		setType(Type.NORMAL);
		setMove(new TakeDown(), new Bulldoze(), new DoubleTeam(), new DrillRun());
	}
}
class TakeDown extends PhysicalMove {
	public TakeDown() {
		super(Type.NORMAL, 90, 0.85);
	}
	@Override
	protected void applySelfDamage(Pokemon att, double damage){
		att.setMod(Stat.HP, (int) Math.round(damage) / 4);
	}
}
class Bulldoze extends PhysicalMove {
	public Bulldoze() {
		super(Type.GROUND, 60, 1.0);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.SPEED, -1);
	}
}
class DoubleTeam extends StatusMove {
	public DoubleTeam() {
		super(Type.NORMAL, 0, 0);
	}
	@Override
	protected void applySelfEffects(Pokemon p){
		Effect pEff = new Effect();
		pEff.turns(1);
		pEff.stat(Stat.EVASION, 1);
		p.setCondition(pEff);
	}
}
class DrillRun extends PhysicalMove {
	public DrillRun() {
		super(Type.GROUND, 80, 0.95);
	}
}