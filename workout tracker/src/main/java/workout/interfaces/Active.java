package workout.interfaces;

import org.springframework.stereotype.Component;
import workout.model.WorkoutActive;

import java.util.List;
@Component
public interface Active {
    public void startWorkout(WorkoutActive active);
    public void endWorkout(WorkoutActive active);
    public List<WorkoutActive> getWorkoutStatus();

}
