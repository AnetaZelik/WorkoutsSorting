import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.Duration;
import java.util.Comparator;

@Data
@AllArgsConstructor
public class Workout {
    private String name;
    private Duration duration;
    private Trainer trainer;

    static Comparator<Workout> sortByWorkoutsName = Comparator.comparing(Workout::getName);
    static Comparator<Workout> sortByDuration = Comparator.comparing(Workout::getDuration);

}