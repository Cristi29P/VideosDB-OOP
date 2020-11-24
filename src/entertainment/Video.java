package entertainment;

import database.UserDB;

import java.util.ArrayList;

public class Video {
    private String title;
    private int launchYear;
    private ArrayList<String> cast;
    private ArrayList<String> genres;

    public Video() {

    }

    public Video(final String title, final int launchYear, final ArrayList<String> cast, final ArrayList<String> genres) {
        this.title = title;
        this.launchYear = launchYear;
        this.cast = cast;
        this.genres = genres;
    }

    public int numberOfFavorites(final UserDB users) {
        return 0;
    }

    public double doRating() {
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(final int launchYear) {
        this.launchYear = launchYear;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public void setCast(final ArrayList<String> cast) {
        this.cast = cast;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(final ArrayList<String> genres) {
        this.genres = genres;
    }

}
