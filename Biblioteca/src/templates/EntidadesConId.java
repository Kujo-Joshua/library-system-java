package src.templates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class EntidadesConId<E> {
    protected List<E> entidades=new ArrayList<>();
    protected HashMap<Integer, E> entidadId = new HashMap<>();

    public void setentidadId(HashMap<Integer, E> entidadId) {
        this.entidadId = entidadId;
    }
    public void setEntidades(List<E> entidades) {
        this.entidades = entidades;
    }

    public HashMap<Integer, E> getentidadId() {
        return entidadId;
    }
    public List<E> getEntidades() {
        return entidades;
    }

    public E getEntityForId(int id){
        return entidadId.get(id);
    }

    public void addEntidad(E entidad){
        entidades.add(entidad);
    }
    public abstract void deleteEntidad(int id);
    public void updateEntidad(E entidad, int id){
        entidadId.put(id, entidad);
    }
    public abstract void readEntidad(int id);
}
