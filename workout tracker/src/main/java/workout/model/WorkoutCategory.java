package workout.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

@AttributeOverride(name = "id",column = @Column(name="categoryId"))
@Table(name = "test")
public class WorkoutCategory extends AbstractPersistable<Integer> implements Serializable{
    public List<WorkoutCollection> getCollection() {
        return collection;
    }

    public void setCollection(List<WorkoutCollection> collection) {
        this.collection = collection;
    }

    @OneToMany(targetEntity = WorkoutCollection.class,mappedBy = "category",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
private List<WorkoutCollection> collection;
    private String categoryName;
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
