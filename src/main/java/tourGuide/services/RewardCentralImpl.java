package tourGuide.services;


import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;
import tourGuide.interfaces.IRewardCentral;

import java.util.UUID;

@Service
public class RewardCentralImpl implements IRewardCentral {

    private final RewardCentral rewardCentral = new RewardCentral();


    @Override
    public int getAttractionRewardPoints(UUID attractionId, UUID userId)  {
        return rewardCentral.getAttractionRewardPoints(attractionId, userId);
    }


}
