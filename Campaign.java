public class Campaign {
    private String campaignName;
    private String campaignInformation;
    private int campaignId;

    public Campaign(){

    }

    public Campaign(String campaignName, String campaignInformation, int campaignId){
        this.campaignName=campaignName;
        this.campaignInformation=campaignInformation;
        this.campaignId=campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignInformation() {
        return campaignInformation;
    }

    public void setCampaignInformation(String campaignInformation) {
        this.campaignInformation = campaignInformation;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }
}
