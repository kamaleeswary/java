public class MemberClass {

    //static class member{
    public String name;
    public int age;
    public long salary;

    MemberClass() {

    }

    MemberClass(String str, int a, long sal) {
        name = str;
        age = a;
        salary = sal;
    }

    class member_variable {
        MemberClass mb = new MemberClass("herrypotter", 21, 2000);

        public void Display() {
            System.out.println("Name=" + mb.name);
            System.out.println("Age =" + mb.age);
            System.out.println("Salary = " + mb.salary);

        }
    }
    public static void main(String[] args) {
        member_variable mv = new MemberClass().new member_variable();
        mv.Display();
    }
}
