import java.util.ArrayList;

public class PersonDatabase implements PersonCollection
{
  private ArrayList<Person> persons;

  public PersonDatabase()
  {
    this.persons = new ArrayList<>();
  }

  public void addPerson(Person person)
  {
    persons.add(person);
  }

  @Override public Person getPersonWithName(String name)
  {
    try
    {
      Thread.sleep(5000);
    }
    catch (InterruptedException e)
    {
      throw new RuntimeException(e);
    }
    for (int i = 0; i < persons.size(); i++)
    {
      if (persons.get(i).getName().equals(name))
      {
        return persons.get(i);
      }
    }
    return null;
  }
}
