package TesteGenericsSimples3;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal<T> {
    protected Map<String,T> map = new HashMap<>();
    protected abstract Class getClasse();
    protected abstract Class<T> getClasse2();
}
