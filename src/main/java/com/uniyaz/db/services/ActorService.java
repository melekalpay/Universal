package com.uniyaz.db.services;

import com.uniyaz.db.entity.Actor;
import com.uniyaz.db.operations.DbOperationsActor;

import java.util.List;

public class ActorService {
    private DbOperationsActor dbOperationsActor = new DbOperationsActor();

    public List<Actor> findAllActor() {
        return dbOperationsActor.findAllActor();
    }

    public List<Actor> findAllActorByFirstName(String name) {
        return dbOperationsActor.findAllActorByFirstName(name);
    }

    public int saveActor(Actor actor) {

        if (actor.getLastName() == null || "".equals(actor.getLastName())) throw new RuntimeException("Soyadı olmadan kayıt yapılamaz.");
        return dbOperationsActor.saveActor(actor);
    }

    public int updateActor(Actor actor) {
        return dbOperationsActor.updateActor(actor);
    }
    public int deleteActor(Actor actor) {
        return dbOperationsActor.deleteActor(actor);
    }

}
