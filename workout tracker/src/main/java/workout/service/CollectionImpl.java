package workout.service;

import org.springframework.stereotype.Service;
import workout.interfaces.Collection;
import workout.model.WorkoutCollection;
import workout.repo.CollectionRepository;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CollectionImpl implements Collection {
    private CollectionRepository repo;

    public CollectionImpl(CollectionRepository repo) {
        this.repo = repo;
    }

    @Override
    public String addCollection(WorkoutCollection collection) {
        this.repo.save(collection);
        return null;
    }

    @Override
    public List<WorkoutCollection> getAllCollection() {

        return (List<WorkoutCollection>) this.repo.findAll();
    }

    @Override
    public String updateCollection(WorkoutCollection collection) {
        this.repo.save(collection);
        return null;
    }

    @Override
    public void deleteCollection(WorkoutCollection collection) {
this.repo.delete(collection);
    }
}
