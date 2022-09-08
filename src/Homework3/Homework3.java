package Homework3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Homework3 {
    public static void main(String[] args) {
        //Задача №1
        //1. Создать класс User, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<User>
        //3. Переопределить hashcode и equals у User так, чтобы при записи в HashSet, были только уникальные name юзера

        Set<User> userSet = new HashSet<>();
        userSet.add(new User(15, "Dima"));
        userSet.add(new User(14, "Dima"));
        userSet.add(new User(16, "Alex"));
        userSet.add(new User(17, "Alex"));
        System.out.println(userSet);

        //Задача №2
        //1. Создать класс UserBroken, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<UserBroken>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
        // в hashSet всегда оставался один юзер
        Set<UserBroken> userBrokenSet = new HashSet<>();
        userBrokenSet.add(new UserBroken(15, "Dima"));
        userBrokenSet.add(new UserBroken(14, "Dima"));
        userBrokenSet.add(new UserBroken(16, "Alex"));
        userBrokenSet.add(new UserBroken(17, "Alex"));
        System.out.println(userBrokenSet);
        //Задача №3
        //1. Создать класс CarBroken
        //2. Создать экземпляра класса HashMap<CarBroken, Integer>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого CarBroken в HashMap,
        //всегда CarBroken попадал в один бакет.
        Map<CarBroken, Integer> map = new HashMap<>();
        map.put(new CarBroken("Mazda"), 1);
        map.put(new CarBroken("Mazda"), 1);
        map.put(new CarBroken("Ferrari"), 1);
        System.out.println(map);
    }
}
