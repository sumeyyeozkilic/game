public class Main {

    public static void main(String[] args) {
        Customer customer=new Customer("Sümeyye","Özkılıç",2001,"");
        Customer customer1=new Customer("Engin", "Demiroğ", 1985,"");

        CustomerManager customerManager=new CustomerManager(new UserVerificationManager());
        customerManager.add(customer1);
        System.out.println("-----------------------------------");
        customerManager.add(customer);
        System.out.println("-----------------------------------");

        Campaign campaign=new Campaign("Specail %30 "," discount for you",1);
        Campaign campaign1= new Campaign("%40 "," discount for Ramadan",2);

        CampaignManager campaignManager=new CampaignManager();
        campaignManager.add(campaign);
        System.out.println("-----------------------------------");
        campaignManager.uptade(campaign1);
        System.out.println("-----------------------------------");
        campaignManager.remove(campaign);
        System.out.println("-----------------------------------");

        SaleManager saleManager=new SaleManager();
        saleManager.gameSale(customer, campaign1);
        saleManager.gameSale(customer1, campaign);
    }
}
