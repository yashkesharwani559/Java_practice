public class T {
    public static void main(String[] args) {
        User[] users = new User[] {
                new User("yash", 20, new Address(new City("Jabalpur"), new State("mp"))),
                new User("vikrant", 22, new Address(new City("Damoh"), new State("mp"))),
                new User("rahul", 25, new Address(new City("Paris"), new State("London")))
        };
        System.out.println(users);
        System.out.println(users[0]);
        System.out.println(users[1]);
        System.out.println(users[2]);

        for (User a : users) {
            System.out.println(a.name);
            System.out.println(a.age);
            System.out.println(a.address);
        }
        
        for (User a : users) {
            Address ab = a.address;
            System.out.println(ab.city);
            System.out.println(ab.state);
        }
        
        for (User a : users) {
            City ab = a.address.city;
            State ab1 = a.address.state;
            System.out.println(ab.cityName);
            System.out.println(ab1.stateName);
        }
        
    }
}

class User {
    String name;
    int age;
    Address address;
    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class Address{
    City city;
    State state;
    public Address(City city, State state) {
        this.city = city;
        this.state = state;
    }
}

class City{
    String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }
}

class State{
    String stateName;

    public State(String stateName) {
        this.stateName = stateName;
    }
    
}

//this will print output as
// [LUser;@3b22cdd0
// User@1e81f4dc
// User@4d591d15
// User@65ae6ba4
// yash
// 20
// Address@48cf768c
// vikrant
// 22
// Address@59f95c5d
// rahul
// 25
// Address@5ccd43c2
// City@4aa8f0b4
// State@7960847b
// City@6a6824be
// State@5c8da962
// City@512ddf17
// State@2c13da15
// Jabalpur
// mp
// Damoh
// mp
// Paris
// London
