package ey.com.MovieRecords;

import java.util.List;

public interface RecordsDao {

	void add(Records r);

	List<Records> list();

	List<Records> findByActor(String actor);

	List<Records> findByGenre(String genre);

	List<Records> findByTitle(String title);

	void update(Records r);

	void delete(String title);

}
