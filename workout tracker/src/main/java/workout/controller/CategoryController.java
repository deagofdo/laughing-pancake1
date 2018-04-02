package workout.controller;

import org.springframework.web.bind.annotation.*;
import workout.interfaces.Category;
import workout.model.WorkoutCategory;

import java.util.List;

@RestController
@CrossOrigin
public class CategoryController {

    public CategoryController(Category category) {
        this.category = category;
    }

    private Category category;

    @PostMapping("/addCategory")
    public String addCategory(@RequestBody WorkoutCategory category){
        String result=this.category.addCategory(category);
        System.out.println(result);
return null;
    }
    @GetMapping("/getAllCategory")
    public List<WorkoutCategory> getAllCategory(){
        return this.category.getAllCategory();
    }
    @PutMapping("/updateCategory")
    public String updateCategory(@RequestBody WorkoutCategory category){
        this.category.updateCategory(category);
        return null;
    }
    @DeleteMapping("/deleteCategory")
    public String deleteCategory(@RequestBody WorkoutCategory category){
        this.category.deleteCategory(category);
        return null;
    }

}
