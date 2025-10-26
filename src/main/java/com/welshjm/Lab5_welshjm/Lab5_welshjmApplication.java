package com.welshjm.Lab5_welshjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Lab5_welshjmApplication {

    public static void main(String[] args)
    {
     ApplicationContext context =  SpringApplication.run(Lab5_welshjmApplication.class, args);

   //  var userRepository = context.getBean(UserRepository.class);
   //     var userService = context.getBean(UserService.class);
   //     userService.showEntityState();
   //     userService.showRelatedEntities();

     //   userService.persistRelated();
    //      userService.deleteRelated();

   //     var orderService = context.getBean(OrderService.class);
       // var orderservice2 = context.getBean(OrderService.class);
      //var  orderService = new OrderService(new StripePaymentService());
   //     orderService.placeOrder();
       // orderservice2.placeOrder();
     //   var user1 = new User(1L, "John Doe", "jDoe@email.com", "1234");

/*        var user1 = User.builder()
                .name("Jane Smith")
                .email("jSmith@emial.com")
                .password("abcd")
                .build();

       // userRepository.save(user1);
        var user2 = userRepository.findById(2L).orElseThrow();
        System.out.println(user2.getEmail());

        userRepository.deleteById(1L);

        var users = userRepository.findAll();
      users.forEach(u -> System.out.println(u.getName()));

        var address1 = Address.builder()
                .street("123 Main St")
                .city("Springfield")
                .state("IL")
                .zipCode("62701")
                .build();

        user1.addAddress(address1);

        System.out.println(user1); */
    }

}
