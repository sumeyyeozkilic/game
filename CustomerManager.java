public class CustomerManager implements  CustomerService{
    private UserVerificationService userVerificationService;

    public CustomerManager(UserVerificationService userVerificationService){
        super();
        this.userVerificationService=userVerificationService;
    }

    @Override
    public void add(Customer customer) {
        if(userVerificationService.checkIfRealPerson(customer)==true){
            System.out.println("Customer added: "+customer.getFirstName()+" "+customer.getLastName());
        }else{
            System.out.println("Customer not added: "+customer.getFirstName()+" "+customer.getLastName());
        }
    }

    @Override
    public void remove(Customer customer) {
        if(userVerificationService.checkIfRealPerson(customer)==true){
            System.out.println("Customer removed: "+customer.getFirstName()+" "+customer.getLastName());
        }else{
            System.out.println("Customer not removed: "+customer.getFirstName()+" "+customer.getLastName());
        }
    }

    @Override
    public void update(Customer customer) {
        if(userVerificationService.checkIfRealPerson(customer)==true){
            System.out.println("Customer updated: "+customer.getFirstName()+" "+customer.getLastName());
        }else{
            System.out.println("Customer not updated: "+customer.getFirstName()+" "+customer.getLastName());
        }

    }
}
