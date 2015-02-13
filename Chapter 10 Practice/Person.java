import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Person implements Comparable<Person>
{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "Name: " + name;
    }

    public String getName()
    {
        return this.name;
    }

    public int compareTo(Person person)
    {
        return this.getName().compareTo(person.getName());
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<Person>();
        for(int i =0; i < 10; i++)
        {
            int num = i+1;
            System.out.println("What is person #" + num +"'s name? ");
            String string = in.nextLine();
            Person person = new Person(string);
            personList.add(person);
        }
        Collections.sort(personList);

        System.out.println("First: " + personList.get(0));

        System.out.println("Last: " + personList.get(9));

    }
}