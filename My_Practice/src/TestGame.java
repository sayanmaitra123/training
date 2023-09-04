import com.sports.ActionG;
import com.sports.AdventureG;
import com.sports.RaceG;

public class TestGame {
	public static void main(String[] args) {
		
		RaceG g1=new RaceG("NFS Speed","Race and Arcade","Sports", "6 Laps");
		ActionG g2=new ActionG("Death Squad", "FPS Type", "Shooting",12);
		AdventureG g3= new AdventureG("BGMI","Adventure","Shooting",2,5);
		
		g1.details();
		System.out.println();
		g2.details();
		System.out.println();
		g3.details();
	}

}
