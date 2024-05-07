package itmo.lab9;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        //lessons2
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("Java");
        stringCollection.add("Java");
        stringCollection.add("C++");


        Set<String> uniqueList = deliteDublicates(stringCollection);
        for (String p : uniqueList) {
            System.out.println(p);
        }

        //lessons2
        List<Integer> arraylist1 = new ArrayList<>();
        List<Integer> linkedList1 = new LinkedList<>();
        arraylist1 = addElements(arraylist1);
        linkedList1 = addElements(linkedList1);

        long startArrayList = System.currentTimeMillis();
        searchingItem(arraylist1);
        long endArrayList = System.currentTimeMillis();
        long timeArrayList = endArrayList - startArrayList;
        System.out.println("Время выполнения ArrayList " + timeArrayList);

        long startLinkedList = System.currentTimeMillis();
        searchingItem(linkedList1);
        long endLinkedList = System.currentTimeMillis();
        long timeLinkedList = endLinkedList - startLinkedList;
        System.out.println("Время выполнения  LinkedList " + timeLinkedList);
        //Поиск в  LinkedList отрабоатывает дольше по времене, т.к поиск идет по связянному списку рекурсивно, а
        // в ArreyList линойно  в зависимости от размера списка

        //lessons 3
        Map<User, Integer> map = new HashMap<>();

        map.put(new User("Anton"), 1500);
        map.put(new User("Maxim"), 1200);
        map.put(new User("Kristina"), 1600);
        map.put(new User("Petr"), 1000);
        map.put(new User("Alexsandr"), 500);

        Scanner scanner = new Scanner(System.in);
        String nameUser = scanner.next();

        for (Map.Entry<User, Integer> pair : map.entrySet()) {
            User userKey = pair.getKey();
            Integer pairValue = pair.getValue();

            if (userKey.getName().equals(nameUser)) {
                System.out.println("У игрока " + nameUser + " очков: " + pairValue);
            }
        }
    }

    public static Set<String> deliteDublicates(List<String> stringCollection) {

        List<String> listWithoutDuplicates = new ArrayList<>();
        Set<String> uniqueList = new HashSet<>();

        for (String listWithDuplicate : stringCollection)
            if (uniqueList.add(listWithDuplicate)) {
                listWithoutDuplicates.add(listWithDuplicate);
            }
        return uniqueList;
    }

    public static List<Integer> addElements(List<Integer> arraylist1) {

        for (int i = 0; i < 1000000; i++) {
            arraylist1.add(i);
        }
        return arraylist1;
    }

    public static void searchingItem(List<Integer> list1) {

        Random randomizer = new Random();
        for (int i = 0; i < 1000; i++) {

            int p = randomizer.nextInt();
            if (p >= 0 || p < 1000000) {
                list1.contains(randomizer.nextInt());
            }
        }
    }
}




