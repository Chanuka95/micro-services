package moviecatalogservice.repository;

import moviecatalogservice.repository.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCatalogRepository extends JpaRepository<Catalog, Integer> {
}
