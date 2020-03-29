package others;

import java.util.*;

/**
 * @description  描述
 *
 * @author  LT
 * @date  2020/3/29
 */
class User{
    private String name;
    private Integer age;
    public User(String name,Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Integer,User> users = new HashMap<Integer, User>();
        users.put(1,new User("张三",25));
        users.put(3,new User("李四",21));
        users.put(2,new User("王五",28));

        System.out.println(users);

        HashMap<Integer,User> sortHashMap = sortHashMap(users);
        System.out.println(sortHashMap);
    }

    public static HashMap<Integer,User> sortHashMap(HashMap<Integer,User> map) {
        Set<Map.Entry<Integer,User>> entrySet = map.entrySet();

        List<Map.Entry<Integer,User>> list = new ArrayList<>();
        for (Map.Entry<Integer, User> entry : entrySet) {
            list.add(entry);
        }

        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge() - o1.getValue().getAge();
            }
        });

        LinkedHashMap<Integer,User> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, User> entry : list) {
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        return linkedHashMap;
    }
}
