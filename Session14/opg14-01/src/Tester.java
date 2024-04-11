import java.util.Scanner;

public class Tester
{
  public static void main(String[] args)
  {
    PersonDatabase personDatabase = new PersonDatabase();
    Person person1 = new Person("Baris");
    Person person2 = new Person("Bob");
    Person person3 = new Person("Bob marley");
    Person person4 = new Person("Bab");
    Person person5 = new Person("Bib");


    personDatabase.addPerson(person1);
    personDatabase.addPerson(person2);
    personDatabase.addPerson(person3);
    personDatabase.addPerson(person4);
    personDatabase.addPerson(person5);


    CachedPersonCollection cachedPersonCollection = new CachedPersonCollection(personDatabase);


    PersonCollection personCollection = cachedPersonCollection;

    System.out.println(personCollection.getPersonWithName("Baris"));
    System.out.println(personCollection.getPersonWithName("Baris"));

  }
}
