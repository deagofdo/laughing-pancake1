package workout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
/*@ComponentScan({"workout/controller", "workout/model", "workout/interface", "workout/service", "workout/repo", "workout/interfaces"})
@EntityScan(basePackages = {"workout/model"})
@EnableJpaRepositories(basePackages = {"workout/repo"})*/
public class WorkoutTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutTrackerApplication.class, args);
	}
}
