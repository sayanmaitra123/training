import com.bookMyshows.ActionM;
import com.bookMyshows.KidsM;
import com.bookMyshows.LifestoriesM;

public class TestBookMyShow {
	public static void main(String[] args) {
		
		ActionM a1=new ActionM(2,"Premium",500.5, "Bellandur", 120,"When the world dies !!","Action");
		KidsM k1=new KidsM(1,"Normal",200,"Indiranagar",140,"The Bear and his Family", "Kids");
		LifestoriesM l1=new LifestoriesM(4,"Luxury",600.5,"Bellandur",150,"Life of a traveller","Slice of Life");
		
		a1.booking();
		System.out.println();
		k1.booking();
		System.out.println();
		l1.booking();
		
	}

}
