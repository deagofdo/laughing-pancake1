package workout.interfaces;

import workout.model.WorkoutCategory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Category {
    public String addCategory(WorkoutCategory category);
    public List<WorkoutCategory> getAllCategory();
    public String updateCategory(WorkoutCategory category);
    public void deleteCategory(WorkoutCategory category);
}
