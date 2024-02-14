package Dao;

import java.util.HashMap;
import java.util.Map;

public class SingletonMap<T>{
    protected static SingletonMap singletonMap; // Variável para acesso dessa classe externamente;
    private final Map<Class,Map<String,T>> map;
    private SingletonMap( ) {
        map = new HashMap<>();
    }
    public static SingletonMap getInstance(){
        return ( singletonMap== null ) ? new SingletonMap() : singletonMap;
    }
    public Map<Class, Map<String,T>> getMap() {
        return this.map;
    };
}