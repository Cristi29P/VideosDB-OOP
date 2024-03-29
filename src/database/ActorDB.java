package database;
import actor.Actor;
import java.util.ArrayList;


public final class ActorDB {
    private final ArrayList<Actor> actors;

    public ActorDB(final ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }
}
