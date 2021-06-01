package users;

public class Projection {
	private int id_time;
    private int id_movie;

    public Projection() {
		super();
	}

	public Projection(int id_time, int id_movie) {
		super();
		this.id_time = id_time;
		this.id_movie = id_movie;
	}

	public int getId_time() {
        return id_time;
    }

    public void setId_time(int id_time) {
        this.id_time = id_time;
    }

    public int getId_movie() {
        return id_movie;
    }

    public void setId_movie(int id_movie) {
        this.id_movie = id_movie;
    }
}
