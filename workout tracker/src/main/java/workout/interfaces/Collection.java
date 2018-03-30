package workout.interfaces;

import org.springframework.stereotype.Component;
import workout.model.WorkoutCollection;

import java.util.List;

@Component
public interface Collection {
    public String addCollection(WorkoutCollection collection);
    public List<WorkoutCollection> getAllCollection();
    public String updateCollection(WorkoutCollection category);
    public void deleteCollection(WorkoutCollection category);

}
