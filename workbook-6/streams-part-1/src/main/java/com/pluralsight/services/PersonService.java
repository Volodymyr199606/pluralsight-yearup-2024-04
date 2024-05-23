package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonService
{

    public List<Person> findPeople(List<Person> people, String name)
    {

        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(name)) {
                result.add(person);
            }
        }
        return result;
    }
    public List<Person> findPeople(List<Person> people, int age)
    {
        return new ArrayList<>();
    }

    public int calculateAverageAge(List<Person> people)
    {
        int sum = 0;
        for (Person person : people) {
            sum += person.getAge();
        }
        return sum / people.size();
    }

    public int findOldestAge(List<Person> people)
    {

        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }
        return maxAge;
    }

    public int findYoungestAge(List<Person> people)
    {
        int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < minAge) {
                minAge = person.getAge();
            }
        }
        return minAge;
    }

    public List<Person> sortYoungestFirst(List<Person> people)
    {

        people.sort(Comparator.comparingInt(Person::getAge));
        return people;
    }

    public List<Person> sortOldestFirst(List<Person> people)
    {

        people.sort(Comparator.comparingInt(Person::getAge).reversed());
        return people;
    }

    public List<Employee> createEmployees(List<Person> people)
    {
        List<Employee> employees = new ArrayList<>();
        for (Person person : people) {
            double salary = person.getAge() * 3000.0;
            Employee employee = new Employee(person.getFirstName(), person.getLastName(), person.getAge(), salary);
            employees.add(employee);
        }
        return employees;
    }
}