package app;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

@Repository
	public interface ProductRepository extends JpaRepository<Product, Long> {
	    boolean existsBySku(Sort sort);
	}

	

