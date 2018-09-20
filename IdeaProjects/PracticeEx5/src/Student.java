import java.util.*;

public class Student {
    int id, age;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(int id, String name, int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public static void main(String args[]) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "Andy", 25));
        list.add(new Student(102, "Brad", 22));
        list.add(new Student(103, "Andy", 30));
        list.add(new Student(104,"Caty",35));
        list.add(new Student(105,"AAA",35));
        list.add(new Student(106,"AAA",35));
        list.add(new Student(107, "Andy", 25));

        System.out.println("Sorting by Name...");

        Collections.sort(list, new NameComparator());
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.id + " " + st.name + " " + st.age);
            }
        }
    }

    class NameComparator implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            if (o2.getAge() - o1.getAge() != 0)
                return o2.getAge() - o1.getAge();
            else if (o1.getName().compareTo(o2.getName()) != 0)
                return o1.getName().compareTo(o2.getName());
            else
                return o1.getId() - o2.getId();
        }
    }
