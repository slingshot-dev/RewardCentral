package tourGuide.interfaces;


import java.util.UUID;

public interface IRewardCentral {

    int getAttractionRewardPoints(UUID attractionId, UUID userId);

}
