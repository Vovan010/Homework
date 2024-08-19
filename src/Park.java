import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingHours, float price) {
        attractions.add(new Attraction(name, workingHours, price));
    }

    public void printAttractions() {
        System.out.println("Attractions in " + name + ":");
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private float price;

        public Attraction(String name, String workingHours, float price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getPrice() {
            return price;
        }
    }
}

