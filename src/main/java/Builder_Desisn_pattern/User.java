package Builder_Desisn_pattern;

public class User {

   private  int id;
   private  String name;

    private User(UserBuilder userBuilder)
    {
      this.id =userBuilder.id;
      this.name = userBuilder.name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    // inner claas to create builder ==========================================================

    public static class UserBuilder{
        private  int id;
        private  String name;

//        private static int id;
//        private static   String name;

        UserBuilder userBuilder;

        public static UserBuilder builder()
        {
            return new UserBuilder();
            //return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;


         // UserBuilder userBuilder =new UserBuilder();
//            userBuilder =new UserBuilder();
//            userBuilder.name=name;
//           return userBuilder;
        }

        public UserBuilder setId(int id) {
            this.id = id;
            return this ;
           //UserBuilder userBuilder =new UserBuilder();
//            userBuilder =new UserBuilder();
//            userBuilder.id =id;
//            return userBuilder;
        }

        public User build()
        {

            User user = new User(this);
            return user;
        }
    }

}
