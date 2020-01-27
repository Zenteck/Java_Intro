public class Planet {

        public String name;
        public int size;

    public Planet(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String explode() {
//        return "Boom! " + this.name + " has exploded.";
        return String.format("Boom! %s has exploded", this.name);
    }
}

//class Planet
//
//  def initialize(name, size)
//@name = name
//@size = size
//        end
//
//        def get_name()
//        return @name
//  end
//
//          def get_size()
//          return @size
//  end
//
//          def explode()
//          puts "Boom! #{@name} has exploded."
//          end
//
//          end
//
//          mars = Planet.new("Mars", 908973)
//          puts "#{mars.get_name()} is #{mars.get_size()}"
//          mars.explode()