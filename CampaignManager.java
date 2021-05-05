public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Campaign added");
    }

    @Override
    public void remove(Campaign campaign) {
        System.out.println("Campaign removed");
    }

    @Override
    public void uptade(Campaign campaign) {
        System.out.println("Campaign updated");
    }
}
