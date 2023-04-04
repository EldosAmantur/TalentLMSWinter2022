package TestNG;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

public class User {

    @Getter
    @EqualsAndHashCode
    @AllArgsConstructor
    public class Users {

        private String name;
        private int age;

        public void sayHi(){
            System.out.println("Hello from "+ getName());

        }
        public void login (){
            System.out.println("Login "+ getAge());
        }
    }
}
