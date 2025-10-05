package repository;

import model.ChallanDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoChallanDetails extends JpaRepository<ChallanDetails,Integer> {
}
