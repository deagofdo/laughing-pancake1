package workout.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import workout.model.WorkoutCollection;

@Repository
public interface CollectionRepository extends CrudRepository<WorkoutCollection,Integer>{
}
