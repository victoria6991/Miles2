public class BonusMilesService {
    public int calculate (int ticketPrice) {
    int mile = 20;
    int bonusMiles = ticketPrice / mile;
        return bonusMiles;
    }
}
