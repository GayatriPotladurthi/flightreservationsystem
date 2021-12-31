public class PassengerDetails {

        String name;
        int phoneNumber;
        String emailId;
        String street;
        String city;
        String state;

        private PassengerDetails(String name,int phoneNumber,String emailId, String street,String city,String state){
            this.name= name;
            this.phoneNumber = phoneNumber;
            this.emailId = emailId;
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public class void getContactDetails{

            PassengerDetails P1 = new PassengerDetails();
            System.out.println(P1.name);

            PassengerDetails P2 = new PassengerDetails();
            System.out.println(P2.phoneNumber);

            PassengerDetails P3 = new PassengerDetails();
            System.out.println(P3.emailId);

            PassengerDetails P4 = new PassengerDetails();
            System.out.println(P4.street);

            PassengerDetails P5 = new PassengerDetails();
            System.out.println(P5.city);

            PassengerDetails P6 = new PassengerDetails();
            System.out.println(P6.state);

        }

    }
}
