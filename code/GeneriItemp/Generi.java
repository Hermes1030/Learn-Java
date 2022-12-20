package GeneriItemp;

public class Generi <T> implements GenericIte <T>{
    @Override
    public <T> void show(T s) {
        System.out.println(s);
    }
}
