package workout.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

@AttributeOverride(name = "id",column = @Column(name="categoryId"))
public class WorkoutCategory extends AbstractPersistable<Long> implements Serializable{
   /* public WorkoutCollection getCollection() {
        return collection;
    }

    public void setCollection(WorkoutCollection collection) {
        this.collection = collection;
    }*/
/*@JsonBackReference
    @OneToMany(targetEntity = WorkoutCollection.class,mappedBy = "category",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
private List<WorkoutCollection> collection;*/

    private String categoryName;
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
