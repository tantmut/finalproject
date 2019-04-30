package concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {

    public static void main(String[] args) {

        NameList nameList = new NameList();
        nameList.add("first");
        class myThread extends Thread {
            @Override
            public void run() {
                System.out.println(nameList.removeFirst());
            }
        }
        new myThread().start();
        new myThread().start();

    }

    static class NameList {
        private List<String> list = Collections.synchronizedList(new ArrayList<>());

        public void add(String name) {
            list.add(name);

        }

        public synchronized String removeFirst() {
            if (list.size() > 0) {
                return (String) list.remove(0);

            }
            return null;
        }

    }
}
