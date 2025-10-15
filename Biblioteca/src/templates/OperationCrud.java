package src.templates;

public abstract class OperationCrud<T> {
    public final void ejecutar(T object){
        validar(object);
        procesar(object);
        persistir(object);
    }
    protected abstract void validar(T object);
    protected abstract void procesar(T object);
    protected abstract void persistir(T object);
}
