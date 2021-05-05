public class SaleManager {
    public void gameSale(Customer customer, Campaign campaign){
        System.out.println("Customer named "+customer.getFirstName()+" "+customer.getLastName()+" bought the game with "+campaign.getCampaignName()+" "+campaign.getCampaignInformation()+" "+"campaign.");
    }
}
