package com.java.Collections;

import com.java.Collections.collection3.Student;

import java.util.*;

public class PracticeProblems {

    // Problem 1
    public static Map<Integer, Integer> countOccurrences(int[] nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int num : nums) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        return occurrences;
    }

    // Problem 2
    public static Set<Integer> findDuplicates(int[] nums) {
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }

    // Problem 3
    public static List<Integer> modifyList(List<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            if (current == 7) {
                iterator.remove();
            }
//            } else if (current == 1) {
//                iterator.add(10);
//            }
        }
        iterator.add(10);
        return list;
    }

    // Problem 4
    public Map<String, Integer> sortMapByValues(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new CustomCompartor());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    class CustomCompartor implements Comparator<Map.Entry<String, Integer>>{
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            if(o1.getValue() < o2.getValue())
                return -1;
            else if(o1.getValue() > o2.getValue())
                return 1;
            else
                return 0;
        }
    }


    // Problem 5
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        return new ArrayList<>(set);
    }

    // Problem 6
    static class Employee {
        int employeeId;
        String name;
        String department;
        double salary;

        public Employee(int employeeId, String name, String department, double salary) {
            this.employeeId = employeeId;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return employeeId == employee.employeeId;
        }

        @Override
        public int hashCode() {
            return Objects.hash(employeeId);
        }
    }

    public static void main(String[] args) {
        PracticeProblems testCase = new PracticeProblems();
        // Test Problem 1
        int[] nums1 = {1, 2, 3, 2, 1, 3, 4, 5};
        System.out.println("Problem 1: " + testCase.countOccurrences(nums1));

        // Test Problem 2
        int[] nums2 = {1, 2, 3, 2, 1, 3, 4, 5};
        System.out.println("Problem 2: " + testCase.findDuplicates(nums2));

        // Test Problem 3
        List<Integer> list3 = new ArrayList<>(Arrays.asList(3, 7, 1, 9, 5));
        System.out.println("Problem 3: " + testCase.modifyList(list3));

        // Test Problem 4
        Map<String, Integer> map4 = new HashMap<>();
        map4.put("apple", 3);
        map4.put("banana", 7);
        map4.put("cherry", 1);
        map4.put("date", 9);
        map4.put("fig", 5);
        System.out.println("Problem 4: " + testCase.sortMapByValues(map4));

        // Test Problem 5
        List<Integer> list5 = new ArrayList<>(Arrays.asList(2, 4, 3, 2, 6, 4, 8, 10, 3));
        System.out.println("Problem 5: " + testCase.removeDuplicates(list5));

        // Test Problem 6
        System.out.println("Problem 6:");
        Set<Employee> employeeSet = new HashSet<>();

        employeeSet.add(new Employee(1, "Alice", "HR", 50000));
        employeeSet.add(new Employee(2, "Bob", "IT", 60000));
        employeeSet.add(new Employee(3, "Charlie", "Sales", 45000));

        boolean addedDuplicate = employeeSet.add(new Employee(1, "Alice", "HR", 50000));
        System.out.println("Attempt to add a duplicate Employee (same employeeId): " + (addedDuplicate ? "Succeeded" : "Failed"));

        boolean exists = employeeSet.contains(new Employee(2, "Bob", "IT", 60000));
        System.out.println("Employee with employeeId 2 exists in the set: " + exists);

        boolean removed = employeeSet.remove(new Employee(3, "Charlie", "Sales", 45000));
        System.out.println("Employee with employeeId 3 removed: " + removed);

        System.out.println("Number of employees in the HashSet: " + employeeSet.size());

        System.out.println("Employees in the HashSet:");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
            System.out.println(employee.employeeId +  " name: " + employee.name);
        }
    }
}

