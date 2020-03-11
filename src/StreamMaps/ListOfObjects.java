package StreamMaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfObjects {
    public static void main(String[] args) {

        List<Staff> staff = Arrays.asList(
          new Staff("Name1", 22, 2000),
          new Staff("Name2", 24, 3000),
          new Staff("Name3", 30, 4000),
          new Staff(" ", 31, 5000)
        );

        List<String> collectName = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println("Staff name list: " + collectName);

        List<Integer> collectAge = staff.stream().map(x -> x.getAge()).collect(Collectors.toList());
        System.out.println("Staff age list: " + collectAge);

        List<Double> collectSalary = staff.stream().map(x -> x.getSalary()).collect(Collectors.toList());
        System.out.println("Staff salary is: " + collectSalary);

        staff.stream()
                .filter(s -> s.getSalary() > 2000) // salary > 2000
                .map(Staff::getName)
                .filter(n -> n !=null) // not empty name
                .forEach(System.out::println); // Name2-3
    }

    public static class Staff{
        private String name;
        private int age;
        private double salary;

        public Staff(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }
    }
}
