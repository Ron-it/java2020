public class ZooTest
{
    public static void main(String[] args)
    {

        Zoo ofs = new Zoo("OFS");
        Animal newAnimal = new Animal("Dodo", 'M', 1811);
        ofs.addAnimal(newAnimal);
        System.out.println( ofs );
        newAnimal = new Dog("Dudu", 'f', 1888, "chihuahua");
        ofs.addAnimal(newAnimal);
        System.out.println( ofs );
        newAnimal = new Animal("Dada", 'f', 1877);
        ofs.addAnimal(newAnimal);
        System.out.println( ofs );
        newAnimal = new Dog("DeeDee", 'm', 2002, "terrier");
        ofs.addAnimal(newAnimal);
        System.out.println( ofs );
    }
}
