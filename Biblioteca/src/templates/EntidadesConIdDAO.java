package src.templates;

import java.util.HashMap;


public abstract class EntidadesConIdDAO<E> {
    protected HashMap<Integer, E> entidadId = new HashMap<>();

    public void setentidadId(HashMap<Integer, E> entidadId) {
        this.entidadId = entidadId;
    }

    public HashMap<Integer, E> getentidadId() {
        return entidadId;
    }

    public E getEntityForId(int id){
        return entidadId.get(id);
    }

    public abstract void addEntidad(E entidad);

    public abstract void deleteEntidad(int id);
    public abstract int getIdWithoutUsing();
    public abstract void readEntidad(int id);
}
