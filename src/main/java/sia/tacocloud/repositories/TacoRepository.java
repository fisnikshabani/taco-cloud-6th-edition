package sia.tacocloud.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import sia.tacocloud.domain.Taco;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
}
