package Live;

import Music.Playable;
import Music.String.Veena;
import Music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
	Veena v=new Veena();
	Saxophone s=new Saxophone();
	Playable pv,ps;
	pv=new Veena();
	ps=new Saxophone();

	v.play();
	s.play();
	pv.play();
	ps.play();
	}

}
