public class Runner {

    public static void main(String[] args){
        Planet planet = new Planet ("Mars", 908973);
        String name = planet.getName();
        int size = planet.getSize();
//        System.out.println(name);
//        System.out.println(size);
        System.out.println(planet.name + " is " + planet.size);
        System.out.println(planet.explode());

    }

}
