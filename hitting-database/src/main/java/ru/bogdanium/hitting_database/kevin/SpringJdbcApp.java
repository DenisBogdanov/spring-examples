package ru.bogdanium.hitting_database.kevin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.bogdanium.hitting_database.kevin.data.entities.RentalLocation;
import ru.bogdanium.hitting_database.kevin.data.repositories.RentalLocationRepository;

public class SpringJdbcApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        RentalLocationRepository repository = context.getBean(RentalLocationRepository.class);

        // READ
//        RentalLocation location = repository.findById(4);
//        System.out.println(location);

//        List<RentalLocation> locations = repository.findLocationsByState("state");
//        locations.forEach(System.out::println);

        // CREATE
//        RentalLocation location = getLocation();
//        repository.insert(location);
//        System.out.println(location.getRentalLocationId());

        // UPDATE
//        RentalLocation location = repository.findById(5);
//        location.setName("Mirny");
//        location.setAddress1("Mir, 27");
//        location.setAddress2("Mir, 27");
//        location.setCity("Dankov");
//        location.setState("Lipetsk");
//        location.setPostalCode("399820");
//
//        repository.update(location);

        // DELETE
        RentalLocation location = repository.findById(1);
        repository.delete(location);

    }

    public static RentalLocation getLocation() {
        RentalLocation location = new RentalLocation();
        location.setName("Diner");
        location.setAddress1("33 Silver Diner Lane");
        location.setAddress2("Suite 3");
        location.setCity("Dankov");
        location.setState("Lipetsk");
        location.setPostalCode("399850");
        return location;
    }
}
