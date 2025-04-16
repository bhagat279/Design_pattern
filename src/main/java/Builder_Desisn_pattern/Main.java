package Builder_Desisn_pattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder().setId(101).setName("ravi").build();
       System.out.println(user.getId()+":"+user.getName());

        System.out.println(user);

        User user2 =  User.UserBuilder.builder()
                .setId(508)
                .setName("bhagat")
                .build();

        System.out.println(user2);
    }
}
