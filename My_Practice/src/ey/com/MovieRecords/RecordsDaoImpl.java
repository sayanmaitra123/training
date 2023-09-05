package ey.com.MovieRecords;

import java.util.ArrayList;
import java.util.List;

public class RecordsDaoImpl implements RecordsDao {
	private List<Records> records = new ArrayList<>();

	@Override
	public void add(Records r) {
		// TODO Auto-generated method stub

		records.add(r);
		System.out.println("SUCESSFULLY UPDATED !!!");

	}

	@Override
	public List<Records> list() {
		// TODO Auto-generated method stub
		return records;
	}

	@Override
	public List<Records> findByActor(String actor) {

		List<Records> listR = new ArrayList<>();
		// TODO Auto-generated method stub
		for (Records record : records) {
			if (record.getActor().equalsIgnoreCase(actor))
				listR.add(record);

		}
		return listR;

	}

	@Override
	public List<Records> findByGenre(String genre) {
		// TODO Auto-generated method stub

		List<Records> listG = new ArrayList<>();

		for (Records record1 : records) {
			if (record1.getGenre().equalsIgnoreCase(genre))
				listG.add(record1);

		}

		return listG;

	}

	@Override
	public List<Records> findByTitle(String title) {
		// TODO Auto-generated method stub

		List<Records> listT = new ArrayList<>();

		for (Records records1 : records) {
			if (records1.getTitle().equalsIgnoreCase(title))
				listT.add(records1);

		}
		return listT;
	}

	@Override
	public void update(Records r) {
		// TODO Auto-generated method stub

		for (int i = 0; i < records.size(); i++) {
			if (records.get(i).getTitle().equalsIgnoreCase(r.getTitle()))
				records.set(i, r);
			break;

		}

	}

	@Override
	public void delete(String title) {
		// TODO Auto-generated method stub
		for (int i = 0; i < records.size(); i++) {
			if (records.get(i).getTitle().equalsIgnoreCase(title))
				records.remove(i);

		}

	}

}
