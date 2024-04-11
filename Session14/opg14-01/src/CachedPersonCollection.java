public class CachedPersonCollection implements PersonCollection
{
  private Person lastPersonFound;
  private PersonDatabase realSubject;

  public CachedPersonCollection(PersonDatabase realSubject)
  {
    this.realSubject = realSubject;
  }

  public Person getPersonWithName(String name)
  {
    if (lastPersonFound != null && lastPersonFound.getName().equals(name))
    {
      System.out.println("Person found in Proxy");
      return lastPersonFound;
    }
    lastPersonFound = realSubject.getPersonWithName(name);
    return lastPersonFound;
  }
}
