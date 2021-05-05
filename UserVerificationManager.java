public class UserVerificationManager implements UserVerificationService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        if(customer.getBirthYear()<2001){
            System.out.println("User verified");
            return true;
        }else{
            System.out.println("User could not be verified");
            return false;
        }

    }
}
