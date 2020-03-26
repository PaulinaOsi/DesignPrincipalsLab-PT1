/*
Paulina Osikoya
G00348898
Group C
Lecturer: Paul Lennon
Date: 26/3/2020
Assignment Objective: To use the learnings in the Design Princpal lab to apply them to this assignment
and understand the benefits and advantages it gives to programming
 */


package ie.gmit.single;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserController {

    //Handles incoming JSON requests that work on User resource/entity

        //Store used by controller
        /*Added two new classes Userstorage and Uservalidation to compile with
          single responsibility rule
         */
        private UserStorage storage = new UserStorage();
        private UserValidation uvalidation = new UserValidation();

        //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();

            User user = mapper.readValue(userJson, User.class);

            if(!uvalidation.success(user)) {
                return "ERROR";
            }

            storage.storeUser(user);

            return "SUCCESS";
        }

 }

