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

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class InternetSessionHistory {

    public static class InternetSession {
        
        private LocalDateTime begin;

        private Long subscriberId;

        private Long dataUsed;
        
        public InternetSession(Long subscriberId, LocalDateTime begin, long dataUsed) {
            this.begin = begin;
            this.dataUsed = dataUsed;
            this.subscriberId = subscriberId;
        }

        /**
         * @return the begin
         */
        public LocalDateTime getBegin() {
            return begin;
        }

        /**
         * @return the data used
         */
        public long getDataUsed() {
            return dataUsed;
        }

        /**
         * @return the subscriber
         */
        public Long getSubscriberId() {
            return subscriberId;
        }

    }
    private static final Map<Long, List<InternetSession>> SESSIONS = new HashMap<>();

    public synchronized static List<InternetSession> getCurrentSessions(Long subscriberId) {
        if(!SESSIONS.containsKey(subscriberId)) {
            return Collections.emptyList();
        }
        return SESSIONS.get(subscriberId);
    }

    public synchronized static void addSession(Long subscriberId, LocalDateTime begin, long dataUsed) {
        List<InternetSession> sessions;
        if(!SESSIONS.containsKey(subscriberId)) {
            sessions = new LinkedList<>();
            SESSIONS.put(subscriberId, sessions);
        } else {
            sessions = SESSIONS.get(subscriberId);
        }
        sessions.add(new InternetSession(subscriberId, begin, dataUsed));
    }
}