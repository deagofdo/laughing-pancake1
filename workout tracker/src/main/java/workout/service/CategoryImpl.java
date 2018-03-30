package workout.service;

import workout.interfaces.Category;
import workout.model.WorkoutCategory;
import org.springframework.stereotype.Service;
import workout.repo.CategoryRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoryImpl implements Category {
    public CategoryImpl(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    private CategoryRepository categoryRepo;

    @Override
    public String addCategory(WorkoutCategory category) {
        categoryRepo.save(category);
        return null;
    }

    @Override
    public List<WorkoutCategory> getAllCategory() {
        return (List<WorkoutCategory>)categoryRepo.findAll();
    }

    @Override
    public String updateCategory(WorkoutCategory category) {
        categoryRepo.save(category);
        return null;
    }

    @Override
    public void deleteCategory(WorkoutCategory category) {

        categoryRepo.delete(category);
    }
}
