package workout.repo;

import workout.model.WorkoutCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<WorkoutCategory,Integer> {
}
