import java.util.ArrayList;
import java.util.List;

public class AlbumDaoImpl implements AlbumDao {
	private List<Album> albumL = new ArrayList<>();

	@Override
	public void persist(Album album) {
		albumL.add(album);
	}

	@Override
	public Album findByTitle(String title) throws InvalidAlbumException {
		for (Album album : albumL) {
			if (album.getTitle().equals(title)) {
				return album;
			}
		}
		throw new InvalidAlbumException("Album not found with title: " + title);

	}

	@Override
	public List<Album> list() {
		return albumL;
	}

	@Override
	public List<Album> findByArtist(String artist) {
		List<Album> result = new ArrayList<>();
		for (Album album : albumL) {
			if (album.getArtist().equals(artist)) {
				result.add(album);
			}
		}
		return result;
	}

	@Override
	public List<Album> findByGenre(String genre) {
		List<Album> result = new ArrayList<>();
		for (Album album : albumL) {
			if (album.getGenre().equals(genre)) {
				result.add(album);
			}
		}
		return result;
	}

	@Override
	public boolean update(Album album) {
		for (int i = 0; i < albumL.size(); i++) {
			if (albumL.get(i).getTitle().equals(album.getTitle())) {
				albumL.set(i, album);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(String title) throws InvalidAlbumException {
		for (int i = 0; i < albumL.size(); i++) {
			if (albumL.get(i).getTitle().equals(title)) {
				albumL.remove(i);
				return true;
			}
		}
		throw new InvalidAlbumException("Album not found with title: " + title);
	}
}