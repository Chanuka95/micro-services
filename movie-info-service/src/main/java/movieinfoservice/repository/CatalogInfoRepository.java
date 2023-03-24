package movieinfoservice.repository;

import movieinfoservice.repository.model.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogInfoRepository extends JpaRepository<Info, Integer> {
}
