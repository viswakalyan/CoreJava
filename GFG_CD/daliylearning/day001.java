I have a list of student objects i have to get 2 lists , one list with student name start with s and other list of rest , using java8

Example01:

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice"));
        studentList.add(new Student("Bob"));
        studentList.add(new Student("Charlie"));
        studentList.add(new Student("David"));
        studentList.add(new Student("Sophia"));
        studentList.add(new Student("Sam"));
        studentList.add(new Student("Eve"));

        List<String> startsWithS = studentList.stream()
                .map(Student::getName)
                .filter(name -> name.startsWith("S"))
                .collect(Collectors.toList());

        List<String> rest = studentList.stream()
                .map(Student::getName)
                .filter(name -> !name.startsWith("S"))
                .collect(Collectors.toList());

        System.out.println("Students with names starting with 'S': " + startsWithS);
        System.out.println("Rest of the students: " + rest);
    }
}

------------------------------------------------------------------------------------------------------------

Example 02:

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice"));
        studentList.add(new Student("Bob"));
        studentList.add(new Student("Charlie"));
        studentList.add(new Student("David"));
        studentList.add(new Student("Sophia"));
        studentList.add(new Student("Sam"));
        studentList.add(new Student("Eve"));

        Map<Boolean, List<String>> partitionedMap = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.partitioningBy(name -> name.startsWith("S")));

        List<String> startsWithS = partitionedMap.get(true);
        List<String> rest = partitionedMap.get(false);

        System.out.println("Students with names starting with 'S': " + startsWithS);
        System.out.println("Rest of the students: " + rest);
    }
}
