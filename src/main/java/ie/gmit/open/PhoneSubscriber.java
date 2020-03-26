/*
Paulina Osikoya
G00348898
Group C
Lecturer: Paul Lennon
Date: 26/3/2020
Assignment Objective: To use the learnings in the Design Princpal lab to apply them to this assignment
and understand the benefits and advantages it gives to programming
 */

package ie.gmit.open;

import java.util.List;



public class PhoneSubscriber extends Subscriber {

    public PhoneSubscriber() {
        super();
    }

    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(getSubscriberId());
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*getBaseRate()/100;
    }

}