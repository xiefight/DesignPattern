package test;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-22 21:49
 **/
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        //浅拷贝：被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用仍然指向原来的对象。
        Student student = new Student("张三",15);
//        Student student1 = (Student) student.clone();
//
//        System.out.println(student1.getName()+student1.getAge());

        //深拷贝：深复制把要复制的对象所引用的对象都复制了一遍
        Teacher teacher = new Teacher("张老师",student);
        Teacher teacher1 = (Teacher) teacher.clone();
        Student studentClone = teacher1.getStudent();
        studentClone.setAge(30);

        System.out.println(teacher);
        System.out.println(teacher1);


    }

}

class Teacher implements Cloneable{

    private String name;
    private Student student;

    public Teacher(String name,Student student){
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", student.name=" + student.getName() +
                ", student.age=" + student.getAge() +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Teacher teacher = (Teacher) super.clone();
        teacher.setStudent((Student) teacher.getStudent().clone());
        return teacher;
    }
}

class Student implements Cloneable{

    private String name;
    private int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
