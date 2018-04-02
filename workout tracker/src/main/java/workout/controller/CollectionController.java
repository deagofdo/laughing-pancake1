package workout.controller;

import org.springframework.web.bind.annotation.*;
import workout.interfaces.Collection;
import workout.model.WorkoutCollection;

import java.util.List;

@RestController
@CrossOrigin

public class CollectionController {
    private Collection collection;

    public CollectionController(Collection collection) {
        this.collection = collection;
    }
    @PostMapping("/addCollection")
    public String addCollection(@RequestBody WorkoutCollection collection){
        String result=this.collection.addCollection(collection);
        System.out.println(result);
        return null;
    }
    @GetMapping("/getAllCollection")
    public List<WorkoutCollection> getAllCollection(){
        return this.collection.getAllCollection();
    }
    @PutMapping("/updateCollection")
    public String updateCollection(@RequestBody WorkoutCollection collection){
        this.collection.updateCollection(collection);
        return null;
    }
    @DeleteMapping("/deleteCollection")
    public String deleteCollection(@RequestBody WorkoutCollection collection){
        this.collection.deleteCollection(collection);
        return null;
    }
}
