package workout.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AttributeOverride(name = "id",column = @Column(name="workoutId"))

public class WorkoutCollection extends AbstractPersistable<Long> implements Serializable{
    public String getWorkoutTitle() {
        return workoutTitle;
    }

    public void setWorkoutTitle(String workoutTitle) {
        this.workoutTitle = workoutTitle;
    }

    public String getWorkoutNote() {
        return workoutNote;
    }

    public void setWorkoutNote(String workoutNote) {
        this.workoutNote = workoutNote;
    }

    public float getCaloriesBurnPerMin() {
        return caloriesBurnPerMin;
    }

    public void setCaloriesBurnPerMin(float caloriesBurnPerMin) {
        this.caloriesBurnPerMin = caloriesBurnPerMin;
    }

   /* public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }*/
private String workoutTitle;
private String workoutNote;
private float caloriesBurnPerMin;
//private int categoryId;

    public WorkoutCategory getCategory() {
        return category;
    }

    public void setCategory(WorkoutCategory category) {
        this.category = category;
    }

@OneToOne(fetch = FetchType.EAGER,targetEntity = WorkoutCategory.class)
@JoinColumn(name = "category_id")
    private WorkoutCategory category;
//private int categoryId;
}
