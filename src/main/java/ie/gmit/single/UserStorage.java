/*
Paulina Osikoya
G00348898
Group C
Lecturer: Paul Lennon
Date: 26/3/2020
Assignment Objective: To use the learnings in the Design Principals lab to apply them to this assignment
and understand the benefits and advantages it gives to programming
 */
//added UserStorage to let have storing the user have it's own responsibility
package ie.gmit.single;

public class UserStorage {

    private Store store = new Store();

    public void storeUser(User user) {
        store.store(user);
    }
}
