package tourGuide;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tourGuide.interfaces.IRewardCentral;

import java.util.UUID;


@RestController
public class RewardCentralController {

    private final IRewardCentral rewardCentralService;

    public RewardCentralController(IRewardCentral rewardCentralService) {
        this.rewardCentralService = rewardCentralService;
    }

    @GetMapping("/getAttractionRewardPoints")

    public int userAttract(@RequestParam UUID attractionId, @RequestParam UUID userId) {return rewardCentralService.getAttractionRewardPoints(attractionId, userId);}

}