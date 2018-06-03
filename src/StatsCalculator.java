
import java.text.DecimalFormat;
import java.util.List;

public class StatsCalculator {

    public StatsCalculator() {

    }

    public double getAverageAmount(List<User> users){
        double sum = 0.0;
        for (User user : users) {
            sum += user.getAmount();
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double avg = sum / users.size();
        return Double.parseDouble(decimalFormat.format(avg));
    }
}
